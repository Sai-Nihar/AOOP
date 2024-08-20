package com.bankingsystem;

public class BankLogin {
    private static BankLogin instance;
    private boolean loggedIn;
    private BankLogin() {
        loggedIn = false;
    }
    public static BankLogin getInstance() {
        if (instance == null) {
            instance = new BankLogin();
        }
        return instance;
    }
    public void login() {
        loggedIn = true;
        System.out.println("User logged in.");
    }
    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
}