import org.w3c.dom.Entity;

public class World {

    Entity[][] mapArray;

    // Creates an instance of a map with a user-defined size
    public World(int width, int height) {
        mapArray = new Entity[width][height];
    }
}