package com.game;

public class HealthPotion implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Drinking health potion!");
    }
}
