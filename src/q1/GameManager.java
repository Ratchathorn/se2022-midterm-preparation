package q1;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

//    public GameManager manager;
    public static final GameManager manager = new GameManager();
//    public static List<Character> characters;
    private List<Character> characters;

//    public GameManager() {
//        this.characters = new ArrayList<Character>();
//    }
    private GameManager() {
        this.characters = new ArrayList<Character>();
    }

//    public GameManager getManager() {
//        return manager;
//    }
    public static final GameManager getManager() {
        return manager;
    }

    public void addCharacter(Character c) {
        // ....
    }

    // ...
}
