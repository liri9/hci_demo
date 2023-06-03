package com.example.hci_demo.utils;

public class AppManager {
    private User loggedInUser ;
    private static AppManager appManager;

    private AppManager(){}
    public static void init() {

        if (appManager == null) appManager = new AppManager();
    }

    public static synchronized AppManager getInstance(){
        if (appManager == null) appManager = new AppManager();
        return appManager;
    }

    public void setLoggedInUser(User user) {
        loggedInUser = user;
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }
}
