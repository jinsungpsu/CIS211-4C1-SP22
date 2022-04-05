import java.io.BufferedReader;
import java.io.File;

public class Assignment6Driver {
    public static void main(String[] args) {
        int numCities = 10000;
        HashMap<LatLongLocation> cities = importCities(new File("worldcities.csv"), numCities);
        System.out.println("Imported " + numCities + " cities with " + cities.getCollisions() + " collisions.");
        System.out.println(numCities - cities.getCollisions() + " cities successfully stored in map.");
    }

    static HashMap<LatLongLocation> importCities (File file, int numCities) {

        HashMap<LatLongLocation> map = new HashMap<>();

        BufferedReader reader;

        return map;

    }
}
