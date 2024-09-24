package com.game;

public class Main {
    public static void main(String[] args) {
        // Manage game state using Singleton
        GameState gameState = GameState.getInstance();
        gameState.setLevel(1);
        gameState.setDifficulty("Easy");

        System.out.println("Game Level: " + gameState.getLevel());
        System.out.println("Game Difficulty: " + gameState.getDifficulty());

        // Create enemies using Factory Method
        EnemyFactory goblinFactory = new GoblinFactory();
        Enemy goblin = goblinFactory.createEnemy();
        goblin.attack();

        EnemyFactory orcFactory = new OrcFactory();
        Enemy orc = orcFactory.createEnemy();
        orc.attack();

        // Create game items using the dynamic factory
        GameItemFactory itemFactory = new GameItemFactory();

        // Creating weapons
        Weapon sword = itemFactory.createWeapon("sword");
        Weapon bow = itemFactory.createWeapon("bow");

        // Using weapons
        sword.use();
        bow.use();

        // Creating power-ups
        PowerUp shield = itemFactory.createPowerUp("shield");
        PowerUp healthPotion = itemFactory.createPowerUp("healthpotion");

        // Activating power-ups
        shield.activate();
        healthPotion.activate();
    }
}
