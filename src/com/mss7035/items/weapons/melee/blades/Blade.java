package Testing.items.weapons.melee.blades;

import Testing.items.weapons.*;
import Testing.items.weapons.melee.*;

public class Blade extends Weapon implements Melee {
    private int sharpness;
    static enum Type {
        SHORT_SWORD,
        LONG_SWORD,
        CLAYMORE,
        RAPIER,
        KATANA,
        MACHETE,
        CUTLASS,
        DAGGER,
        CLEAVER;
    }
    public Blade() {

    }
}
