package com.mss7035.entities;

import java.util.UUID;
import java.io.Serializable;
import com.mss7035.entities.character.*;

public abstract class Entity implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String UID;
    private final String NAME;
    private final Vitals VITALS;
    private final Direction direction;

    public Entity(String name) {
        UID = UUID.randomUUID().toString();
        NAME = name;
        VITALS = new Vitals();
        direction = Direction.NORTH;
    }
    public String getUID() {
        return UID;
    }
    public String getName() {
        return NAME;
    }
    public Vitals getVitals() {
        return VITALS;
    }
    public Direction getDirection() {
        return direction;
    }
}