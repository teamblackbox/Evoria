package Testing;

public class SaveTest {
    
    public static void main(String[] args) {
        Location map = new Location("Test");
        System.out.println("Old location...");
        State.save((Object) map, "Testing/" + map.getName());
        System.out.println("New location...");
        Location newMap = (Location) State.load("Test");
    }
}
