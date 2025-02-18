public class SciFiMUDFactory implements IMUDAbstractFactory {
    @Override
    public IGameEntity createRoom(String name) {
        return new Room(name, "A high-tech futuristic chamber.");
    }

    @Override
    public IGameEntity createNPC(String name) {
        return new NPC(name, "A cybernetic AI-driven entity.");
    }
}