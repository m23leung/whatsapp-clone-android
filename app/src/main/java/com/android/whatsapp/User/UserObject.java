package com.android.whatsapp.User;

public class UserObject {

    private String  uid,
                    name,
                    phone;

    public UserObject(String name, String phone, String uid) {
        this.name = name;
        this.phone = phone;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUid() {
        return uid;
    }

}
