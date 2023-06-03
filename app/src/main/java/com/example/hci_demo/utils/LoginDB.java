package com.example.hci_demo.utils;

import java.util.ArrayList;
import java.util.Dictionary;

public class LoginDB {
    private static ArrayList<User> vault = new ArrayList<>();

    public LoginDB() {
    }

    public static void hardCoded()
    {

//        vault.add(new User("avi@food.com", "1111", UserType.supplier));
//        vault.add(new User("ravi@food.com", "1111", UserType.supplier));
//        vault.add(new User("flop@gmail.com", "1111", UserType.guest));
//        vault.add(new User("natanel@hotmail.com", "1111", UserType.guest));
//        vault.add(new User("frigid@ymail.com", "1111", UserType.guest));
//        vault.add(new User("dana@ymail.com", "1111", UserType.orginazer));
//        vault.add(new User("worker1@rmail.com", "1111", UserType.staff));
//        vault.add(new User("worker2@rmail.com", "1111", UserType.staff));
//        vault.add(new User("worker3@rmail.com", "1111", UserType.staff));
//        vault.add(new User("staff", "1111", UserType.staff));
//        vault.add(new User("supplier", "1111", UserType.supplier));
//        vault.add(new User("guest", "1111", UserType.guest));
//        vault.add(new User("orginazer", "1111", UserType.orginazer));

        vault = new ArrayList<>(); // Initialize the list

        User user1 = new User("avi@food.com", "1111", UserType.supplier);
        user1.setSupType("Catering");
        user1.setMinPrice(1000);
        user1.setTopPrice(9000);
        user1.setDescription("Hello, I am Avi. I do Catering");
        vault.add(user1);

        User user2 = new User("ravi@food.com", "1111", UserType.supplier);
        user2.setSupType("Flowers");
        user2.setMinPrice(500);
        user2.setTopPrice(5000);
        user2.setDescription("Hello, I am Ravi. I provide Flower arrangements");
        vault.add(user2);

        User user3 = new User("flop@gmail.com", "1111", UserType.guest);
        vault.add(user3);

        User user4 = new User("natanel@hotmail.com", "1111", UserType.guest);
        vault.add(user4);

        User user5 = new User("frigid@ymail.com", "1111", UserType.guest);
        vault.add(user5);

        User user6 = new User("dana@ymail.com", "1111", UserType.orginazer);
        vault.add(user6);

        User user7 = new User("worker1@rmail.com", "1111", UserType.staff);
        vault.add(user7);

        User user8 = new User("worker2@rmail.com", "1111", UserType.staff);
        vault.add(user8);

        User user9 = new User("worker3@rmail.com", "1111", UserType.staff);
        vault.add(user9);

        User user10 = new User("staff", "1111", UserType.staff);
        vault.add(user10);

        User user11 = new User("supplier", "1111", UserType.supplier);
        user11.setSupType("Random Supplier Type");
        user11.setMinPrice(100);
        user11.setTopPrice(500);
        user11.setDescription("Hello, I am a generic supplier");
        vault.add(user11);

        User user12 = new User("guest", "1111", UserType.guest);
        vault.add(user12);

        User user13 = new User("orginazer", "1111", UserType.orginazer);
        vault.add(user13);
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
