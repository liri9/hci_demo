package com.example.hci_demo.utils;

import java.util.ArrayList;
import java.util.Dictionary;

public class LoginDB {
    private static ArrayList<User> vault = new ArrayList<>();

    public LoginDB() {
    }

    public static void hardCoded()
    {
        vault.add(new User("avi@food.com", "1111", UserType.supplier));
        vault.add(new User("ravi@food.com", "1111", UserType.supplier));
        vault.add(new User("flop@gmail.com", "1111", UserType.guest));
        vault.add(new User("natanel@hotmail.com", "1111", UserType.guest));
        vault.add(new User("frigid@ymail.com", "1111", UserType.guest));
        vault.add(new User("dana@ymail.com", "1111", UserType.orginazer));
        vault.add(new User("worker1@rmail.com", "1111", UserType.staff));
        vault.add(new User("worker2@rmail.com", "1111", UserType.staff));
        vault.add(new User("worker3@rmail.com", "1111", UserType.staff));
        vault.add(new User("staff", "1111", UserType.staff));
        vault.add(new User("supplier", "1111", UserType.supplier));
        vault.add(new User("guest", "1111", UserType.guest));
        vault.add(new User("orginazer", "1111", UserType.orginazer));
    }
    public static void add(String email, String password, UserType userType)
    {
        vault.add(new User(email, password, userType));
    }
    public static User get(String email, String password)
    {
        for (User user :
                vault) {
            if (email.equals(user.getEmail()) &&
            password.equals(user.getPassword())){
                return user;
            }
        }
        return null;
    }
}
