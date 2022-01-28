package com.mss7035.entities.character;

public class Vitals {
    private double healthMax;
    private double health;
    private double fatigueMax;
    private double fatigue;
    private double stamina;
    private double corruption;

    public Vitals() {
        this.healthMax = 100;
        this.health = healthMax;
        this.fatigueMax = 100;
        this.fatigue = fatigueMax;
        this.stamina = 100;
        this.corruption = 0;
    }
}