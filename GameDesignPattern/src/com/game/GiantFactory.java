package com.game;


public class GiantFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Giant();
    }
}