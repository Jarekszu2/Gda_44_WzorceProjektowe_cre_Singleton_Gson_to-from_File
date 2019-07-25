package creational.wzorceProjektowe1_Builder_Zad_1;

public class GameCharacter {
    private String name;
    private String health;
    private String mana;
    private int numberOfPoints;

    public GameCharacter(String name, String health, String mana, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder {

        private String name = "Yeti";
        private String health = "Alive";
        private String mana;
        private int numberOfPoints = 5;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(String health) {
            this.health = health;
            return this;
        }

        public Builder setMana(String mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter createGameCharacter() {
            return new GameCharacter(name, health, mana, numberOfPoints);
        }
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health='" + health + '\'' +
                ", mana='" + mana + '\'' +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }
}
