public class FantasyMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom(String name) {
        return new Room(name, "A magical and mysterious place.");
    }

    @Override
    public IGameEntity createNPC(String name) {
        return new NPC(name, "A mystical creature from a fantasy world.");
    }
}
