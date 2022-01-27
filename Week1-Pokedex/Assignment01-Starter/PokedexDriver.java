import java.io.*;
import java.util.ArrayList;

public class PokedexDriver {
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemonList = readCSV("Assignment01-Pokedex/pokemon.csv");
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
                 */

        for (Pokemon each: pokemonList) {
            System.out.println(each);
        }

    }

    private static ArrayList<Pokemon> readCSV(String filename) {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();

        try {
            Reader reader = new FileReader(filename);
            BufferedReader input = new BufferedReader(reader);

            try {
                String infoFromCSV;
                do {
                    infoFromCSV = input.readLine();
                    System.out.println(infoFromCSV);
                } while(infoFromCSV != null);
            } catch (IOException e) {
                System.out.println("No info...");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            return null;
        }

        //BufferedReader input = new BufferedReader(new FileReader(filename));

        // read the CSV file
        // create each pokemon object from each line of the CSV file
        // then add it to the ArrayList
        // then finally return it to main

        return pokemonList;
    }
}