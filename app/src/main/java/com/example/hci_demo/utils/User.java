package com.example.hci_demo.utils;

public class User {
    private String email;
    private String password;
    private UserType type;

    public User(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", type=" + type +
                '}';
    }
}
