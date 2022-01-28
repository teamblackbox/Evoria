package com.mss7035.entities;

import java.io.Serializable;
import com.mss7035.entities.character.*;
import com.mss7035.State;

public class Player extends Character {
    private final Attributes ATTRIBUTES;
    private final Inventory INVENTORY;
    private final Vitals VITALS;

    public Player(String name) {
        super(name);
        ATTRIBUTES = new Attributes();
        INVENTORY = new Inventory();
        VITALS = new Vitals();
    }
    public Attributes getAttributes() {
        return ATTRIBUTES;
    }
    public Inventory getInventory() {
        return INVENTORY;
    }
    public Vitals getVitals() {
        return VITALS;
    }
}