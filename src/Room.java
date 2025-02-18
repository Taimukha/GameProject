public class Room implements IGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void describe() {
        System.out.println(name + ": " + description);
    }
}