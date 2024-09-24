package com.game;
public class GameItemFactory {
    
    // Method to create a Weapon based on the type
    public Weapon createWeapon(String type) {
        switch (type.toLowerCase()) {
            case "sword":
                return new Sword();
            case "bow":
                return new Bow();
            default:
                throw new IllegalArgumentException("Unknown weapon type: " + type);
        }
    }

    // Method to create a PowerUp based on the type
    public PowerUp createPowerUp(String type) {
        switch (type.toLowerCase()) {
            case "shield":
                return new Shield();
            case "healthpotion":
                return new HealthPotion();
            default:
                throw new IllegalArgumentException("Unknown power-up type: " + type);
        }
    }
}

