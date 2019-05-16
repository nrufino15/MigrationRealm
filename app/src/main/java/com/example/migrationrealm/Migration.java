package com.example.migrationrealm;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
import io.realm.FieldAttribute;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;

public class Migration implements io.realm.RealmMigration {

    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
        RealmSchema schema = realm.getSchema();
        if (oldVersion == 0) {
            RealmObjectSchema contactSchema = schema.get("UserContact");

            contactSchema
                    .addField("newNumber", String.class, FieldAttribute.REQUIRED)
                    .transform(new RealmObjectSchema.Function() {
                        @Override
                        public void apply(DynamicRealmObject obj) {
                            obj.set("newNumber", obj.getString("name") + " " + obj.getString("number"));
                        }
                    })
                    .removeField("name")
                    .removeField("number");
            oldVersion++;
        }

    }
}
