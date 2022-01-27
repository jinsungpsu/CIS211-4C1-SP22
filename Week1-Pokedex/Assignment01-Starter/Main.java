import java.util.ArrayList;

public class Main {
    /*
    Import/read through pokemon.csv
    As we look through that file, create a bunch of Pokemon objects
    Put each of those pokemon objects inside an ArrayList
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        // = readCSV("pokemon.csv");

        /*
        #,Name,Type 1,Type 2,Total,HP,Attack,Defense,Sp. Atk,Sp. Def,Speed,Generation,Legendary
        0: #,
        1: Name,
        2: Type 1,
        3: Type 2,
        4: Total,
        5: HP,
        6: Attack,
        7: Defense,
        8: Sp. Atk,
        9: Sp. Def,
        10: Speed,
        11: Generation,
        12: Legendary
        1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,False
        4,Charmander,Fire,,309,39,52,43,60,50,65,1,False
         */

        // do I need a constructor in the Pokemon class?
        // no?

        String pokemonInfoFromCSV = "1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,False";
        String[] pokemonInfoSplit = pokemonInfoFromCSV.split(",");

        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName(pokemonInfoSplit[1]);
        pokemon1.setType1(pokemonInfoSplit[2]);
        pokemon1.setAttack(Integer.parseInt(pokemonInfoSplit[6]));
        //pokemon1.setLegendary(pokemonInfoSplit[12]);

        // yes? b/c we want to input a bunch of values
        Pokemon pokemon2 = new Pokemon("Charmander", "Fire", 49, false);

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);

        for (Pokemon each: pokemonList) {
            String output = "Pokemon info: " + each;
            System.out.println(output);
        }

    }

    private static ArrayList<Pokemon> readCSV(String filename) {


        return null;
    }

    // readCSV method
    // takes a String as a parameter
    // return type is an ArrayList<Pokemon>
}
