package com.mss7035.entities.character;

import java.util.Set;
import java.util.HashSet;
import com.mss7035.items.weapons.*;
import com.mss7035.items.tools.*;
import com.mss7035.items.apparel.clothing.*;
import com.mss7035.items.apparel.armor.*;
import com.mss7035.items.consumables.*;

public class Inventory {
    private double capacityMax;
    private double capacity;
    private Category<Weapon> weapons;
    private Category<Ammunition> ammunition;
    private Category<Tool> tools;
    private Category<Clothing> clothing;
    private Category<Armor> armor;
    private Category<Consumable> consumables;
    
    public Inventory() {
        this.capacityMax = 100;
        this.capacity = 0;
        this.weapons = new Category<>();
        this.ammunition = new Category<>();
        this.tools = new Category<>();
        this.clothing = new Category<>();
        this.armor = new Category<>();
        this.consumables = new Category<>();
    }
    public void setCapacityMax(double capacityMax) {
        this.capacityMax = capacityMax;
    }
    public double getCapacityMax() {
        return capacityMax;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public double getCapacity() {
        return capacity;
    }
    public Category<Weapon> getWeapons() {
        return weapons;
    }
    public Category<Ammunition> getAmmunition() {
        return ammunition;
    }
    public Category<Tool> getTools() {
        return tools;
    }
    public Category<Clothing> getClothing() {
        return clothing;
    }
    public Category<Armor> getArmor() {
        return armor;
    }
    public Category<Consumable> getConsumables() {
        return consumables;
    }
    private class Category<T> {
        private Set<T> items;
    
        public Category() {
            items = new HashSet<T>();
        }
    }
}