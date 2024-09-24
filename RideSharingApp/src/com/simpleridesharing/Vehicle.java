package com.simpleridesharing;

public class Vehicle {
    private String type;

    private Vehicle(String type) {
        this.type = type;
    }

    public void ride() {
        System.out.println("Riding a " + type + "!");
    }

    public static Vehicle createVehicle(String type) {
        return new Vehicle(type);
    }
}

