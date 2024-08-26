package com.example.qradmin;




public class User {
    public String name;
    public String designation;
    public String code;
    public String phone;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String name, String designation, String code, String phone) {
        this.name = name;
        this.designation = designation;
        this.code = code;
        this.phone = phone;
    }
}
