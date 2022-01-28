import java.util.Scanner;

public class MapTest {
    private static Scanner s = new Scanner(System.in);
    private static int[][] map = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };
    private static String message = null;
    private static int posX = 3;
    private static int posY = 3;
    private static int newTile;
    private static enum Direction {
        NORTH, SOUTH, EAST, WEST;
    }
    private static Direction direction = Direction.NORTH;
    private static enum Move {
        UP {
            @Override
            public boolean move() {
                
                direction = Direction.NORTH;
                newTile = map[posY - 1][posX];
                if(newTile == 1) {
                    return false;
                }
                posY--;
                map[posY + 1][posX] = newTile;
                
                return true;
            }
            @Override
            public void turn() {
                direction = Direction.NORTH;
            }
        }, DOWN {
            @Override
            public boolean move() {

                direction = Direction.SOUTH;
                newTile = map[posY + 1][posX];
                if(newTile == 1) {
                    return false;
                }
                posY++;
                map[posY - 1][posX] = newTile;

                return true;
            }
            @Override
            public void turn() {
                direction = Direction.SOUTH;
            }
        }, LEFT {
            @Override
            public boolean move() {

                direction = Direction.WEST;
                newTile = map[posY][posX - 1];
                if(newTile == 1) {
                    return false;
                }
                posX--;
                map[posY][posX + 1] = newTile;

                return true;
            }
            @Override
            public void turn() {
                direction = Direction.WEST;
            }
        }, RIGHT {
            @Override
            public boolean move() {

                direction = Direction.EAST;
                newTile = map[posY][posX + 1];
                if(newTile == 1) {
                    return false;
                }
                posX++;
                map[posY][posX - 1] = newTile;

                return true;
            }
            @Override
            public void turn() {
                direction = Direction.EAST;
            }
        };
        public abstract boolean move();
        public abstract void turn();
    }
    private static enum Display {
        RENDER {
            @Override
            public void use() {
                for(int i = 0; i < map.length; i++) {
                    System.out.print("     ");
                    for(int j = 0; j < map[0].length; j++) {
                        System.out.print(getSprite(map[i][j]) + " ");
                    }
                    System.out.println();
                }
            }
        }, PLACE_PLAYER {
            @Override
            public void use() {
                map[posY][posX] = 2;
            }
        }, DISPLAY_PLAYER {
            @Override
            public void use() {
                System.out.println("X: " + posX + " | Y: " + posY + " | Dir: " + direction);
            }
        }, CLEAR {
            @Override
            public void use() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        };
        public abstract void use();
        
        private static String getSprite(int tile) {
            switch(tile) {
                case 0:
                    return " ";
                case 1:
                    return "#";
                case 2:
                    return "A";
                case 3:
                    return "O";
            }
            return "?";
        }
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("- Map Thing -------------------------");
            Display.PLACE_PLAYER.use();
            Display.RENDER.use();
            Display.DISPLAY_PLAYER.use();
            if(message != null) {
                System.out.println("<!> " + message);
            }
            System.out.print(">>> ");
            switch(s.nextLine()) {
                case "w":
                    if(Move.UP.move() == true) {
                        message = "Moved.";
                    } else {
                        message = "You cannot move that way.";
                    }
                    break;
                case "s":
                    if(Move.DOWN.move()) {
                        message = "Moved.";
                    } else {
                        message = "You cannot move that way.";
                    }
                    break;
                case "a":
                    if(Move.LEFT.move()) {
                        message = "Moved.";
                    } else {
                        message = "You cannot move that way.";
                    }
                    break;
                case "d":
                    if(Move.RIGHT.move()) {
                        message = "Moved.";
                    } else {
                        message = "You cannot move that way.";
                    }
                    break;
                case "i":
                    Move.UP.turn();
                    message = "Turned.";
                    break;
                case "k":
                    Move.DOWN.turn();
                    message = "Turned.";
                    break;
                case "j":
                    Move.LEFT.turn();
                    message = "Turned.";
                    break;
                case "l":
                    Move.RIGHT.turn();
                    message = "Turned.";
                    break;
                case "q":
                    System.exit(0);
                    break;
                case "":
                    message = null;
                    break;
                default:
                    message = "Invalid input.";
            }
            Display.CLEAR.use();
        }
    }
}
