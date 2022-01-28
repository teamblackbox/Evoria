package com.mss7035.items.weapons;

import com.mss7035.items.*;

public class Ammunition extends Item {
    private Type type;

    enum Type {
        ARROW, BOLT, PISTOL, RIFLE, SHOTGUN;
    }

    public Ammunition(Type type) {
        this.type = type;
    }
}
