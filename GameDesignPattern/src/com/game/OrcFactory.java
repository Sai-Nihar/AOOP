package com.game;

public class OrcFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Orc();
    }
}
