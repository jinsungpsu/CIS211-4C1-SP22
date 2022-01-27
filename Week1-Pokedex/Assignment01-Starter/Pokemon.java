public class Pokemon extends Object{
    // define what a pokemon is
    // data fields
    // #,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary

    private String name, type1;
    private int attack;
    private boolean legendary;

    public Pokemon() {

    }

    public Pokemon(String name, String type1, int attack, boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.attack = attack;
        this.legendary = legendary;
    }

    // and what a pokemon does
    // methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAttack(String attack) {
        this.attack = Integer.parseInt(attack);
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1='" + type1 + '\'' +
                ", attack=" + attack +
                ", legendary=" + legendary +
                '}';
    }
}
