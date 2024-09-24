package com.simpleridesharing;

public class UserAuthentication {
    private static UserAuthentication instance;
    private String authenticatedUser;

    private UserAuthentication() {}

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void authenticateUser(String username) {
        this.authenticatedUser = username;
        System.out.println(username + " has been authenticated.");
    }

    public String getAuthenticatedUser() {
        return authenticatedUser;
    }
}

