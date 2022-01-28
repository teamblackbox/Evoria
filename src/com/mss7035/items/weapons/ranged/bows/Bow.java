package Testing.items.weapons.ranged.bows;

import Testing.items.weapons.*;
import Testing.items.weapons.ranged.*;
import Testing.items.weapons.ammunition.*;

public class Bow extends Weapon implements Ranged {
    private Type type;

    static enum Type {
        SHORT_BOW,
        LONG_BOW,
        CROSS_BOW,
        RECURVE_BOW,
        COMPOUND_BOW
    }
    public Bow(int type) {
        super();
        switch(type) {
            case 0:
                this.type = Type.SHORT_BOW;
                break;
            case 1:
                this.type = Type.LONG_BOW;
                break;
            case 2:
                this.type = Type.CROSS_BOW;
                break;
            case 3:
                this.type = Type.RECURVE_BOW;
                break;
            case 4:
                this.type = Type.COMPOUND_BOW;
                break;
        }
    }
}
