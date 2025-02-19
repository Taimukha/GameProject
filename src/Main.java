public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("Тас бөлме", "Бұл қараңғы тас бөлме.");
        Room room2 = new Room("Орман", "Айналада ағаштар, самал жел есіп тұр.");

        room1.connectRoom("forward", room2);
        room2.connectRoom("back", room1);

        Item sword = new Item("sword");
        room1.addItem(sword);

        Player player = new Player("Батыр", room1);
        MUDController controller = new MUDController(player);
        controller.runGameLoop();
    }
}