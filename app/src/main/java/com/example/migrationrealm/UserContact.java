package com.example.migrationrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class
UserContact extends RealmObject {
    
    @PrimaryKey
    private long id;

    @Required
    private String newNumber;

//    @Required
//    private String name;
//
//    @Required
//    private String number;

    private int age;
    private boolean gender;

    public UserContact(){

    }

    public UserContact(long idExt, String nameExt, String numberExt){
        id = idExt;
//        name = nameExt;
//        number = numberExt;
    }
    public UserContact(long idExt, String nameExt, int edadExt, boolean generoExt){
        id = idExt;
        newNumber = nameExt;
//        number = numberExt;
        age = edadExt;
        gender = generoExt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getNumber() {
//        return number;
//    }
//
//    public void setNumber(String numero) {
//        this.number = numero;
//    }

    public String getNameNumber() {
        return newNumber;
    }

    public void setNameNumber(String nameNumber) {
        this.newNumber = nameNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
