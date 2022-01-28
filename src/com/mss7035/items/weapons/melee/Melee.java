package Testing.items.weapons.melee;

import Testing.entities.character.Character;
import Testing.items.weapons.*;

public interface Melee {
    enum Area {
        HEAD, LEFT, CENTER, RIGHT, FEET;
    }
    public static boolean attack(int direction) {
        Area area;
        switch(direction) {
            case 0:
                area = Area.HEAD;
                break;
            case 1:
                area = Area.LEFT;
                break;
            case 2:
                area = Area.CENTER;
                break;
            case 3:
                area = Area.RIGHT;
                break;
            case 4:
                area = Area.FEET;
                break;
        }

        return false;
    }
    public static boolean parry(Weapon weapon, Character opponent) {
        // Will probably base whoever lands a hit based on who has the weapon with the higher power stat
        return false;
    }
    public static boolean block(Weapon weapon) {
        // (I'll figure this out at some point I guess)
        return false;
    }
}
