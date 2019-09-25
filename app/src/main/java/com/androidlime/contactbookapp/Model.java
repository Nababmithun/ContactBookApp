package com.androidlime.contactbookapp;

/**
 * Created by Mithun on 3/15/2019.
 */

public class Model {
    private int id;
    private String name;
    private String age;
    private String phone;
    private byte[] image;

    public Model(int id, String name, String age, String phone, byte[] image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}