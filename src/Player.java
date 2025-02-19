import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private Room currentRoom;
    private List<Item> inventory;

    public Player(String name, Room currentRoom) {
        this.name = name;
        this.health = 100;
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public List<Item> getInventory() {
        return inventory;
    }
}
