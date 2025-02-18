public class ConcreteMUDGameEntityFactory extends MUDGameEntityFactory {
    @Override
    public IGameEntity createEntity(String type, String param) {
        switch (type.toLowerCase()) {
            case "room":
                return new Room(param, "A mysterious place.");
            case "npc":
                return new NPC(param, "A non-playable character.");
            case "player":
                return new Player(param);
            default:
                throw new IllegalArgumentException("Unknown entity type: " + type);
        }
    }
}
