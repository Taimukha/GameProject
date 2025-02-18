

    public class Player implements IGameEntity {
        private String name;
        private int health;

        public Player(String name) {
            this.name = name;
            this.health = 100;
        }

        @Override
        public void describe() {
            System.out.println("Player " + name + " has " + health + " HP.");
        }
    }

