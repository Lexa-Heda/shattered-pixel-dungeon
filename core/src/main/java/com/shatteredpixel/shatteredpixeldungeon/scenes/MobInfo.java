package com.shatteredpixel.shatteredpixeldungeon.scenes;

import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Mob;

public class MobInfo {
    public int position;
    public int health;
    public int maxHealth;
    public Mob.AiState state;

    public MobInfo(int position, int health, int maxHealth, Mob.AiState state) {
        this.position = position;
        this.health = health;
        this.maxHealth = maxHealth;
        this.state = state;
    }
}