package com.game;

public class GameState {
    private static GameState instance;
    private int level;
    private String difficulty;

    private GameState() {
        // Private constructor to prevent instantiation
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    // Getter and Setter for level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter and Setter for difficulty
    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

