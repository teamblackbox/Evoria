package Testing.items.weapons;

import Testing.items.*;

public abstract class Weapon extends Item {
    private double damage;
    private double durability;
    private boolean isModified;

    public Weapon() {

    }
    public void setDamage(double damage) {
        this.damage = damage;
    }
    public double getDamage() {
        return damage;
    }
    public void setDurability(double durability) {
        this.durability = durability;
    }
    public double getDurability() {
        return durability;
    }
    public void setModified() {
        this.isModified = true;
    }
    public boolean getIsModified() {
        return isModified;
    }
}
