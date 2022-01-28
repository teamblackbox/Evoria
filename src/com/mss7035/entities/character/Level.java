package com.mss7035.entities.character;

public class Level { // This class is unnecessary, please delete me
    private int level;
    private double levelProgressMax;
    private double levelProgress;

    public Level() {
        this.level = 1;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevelPrograssMax(double levelProgressMax) {
        this.levelProgressMax = levelProgressMax;
    }
    public double getLevelProgressMax() {
        return levelProgressMax;
    }
    public void setLevelProgress(double levelProgress) {
        this.levelProgress = levelProgress;
    }
    public double getLevelProgress() {
        return levelProgress;
    }
}
