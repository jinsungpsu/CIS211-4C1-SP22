public class Pokemon implements Comparable<Pokemon>{
    private String name;
    private int attack, defense;

    public Pokemon(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public int compareTo(Pokemon o) {
        if (this.name.equals(o.name) && this.defense == o.defense && this.attack == o.attack) {
            return 0;
        } else if (this.defense > o.defense) {
            return 1;
        } else {
            return -1;
        }
    }
}
