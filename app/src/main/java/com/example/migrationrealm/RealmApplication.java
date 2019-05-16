package com.example.migrationrealm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class RealmApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        setupRealmConfig();
        Realm realm = Realm.getDefaultInstance();
        realm.close();
    }

    private void setupRealmConfig(){
        Realm.init(getApplicationContext());
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .schemaVersion(1)
                .migration(new Migration())
                .build();
        Realm.setDefaultConfiguration(config);
    }

}
