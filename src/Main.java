public class Main {
    public static void main(String[] args) {
        IMUDAbstractFactory fantasyFactory = new FantasyMUDFactory();
        IMUDAbstractFactory sciFiFactory = new SciFiMUDFactory();

        IGameEntity fantasyRoom = fantasyFactory.createRoom("Enchanted Forest");
        IGameEntity fantasyNPC = fantasyFactory.createNPC("Elf Guardian");


        IGameEntity sciFiRoom = sciFiFactory.createRoom("Space Station");
        IGameEntity sciFiNPC = sciFiFactory.createNPC("Android Sentinel");


        fantasyRoom.describe();
        fantasyNPC.describe();
        sciFiRoom.describe();
        sciFiNPC.describe();
    }
}