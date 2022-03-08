public class MapDriver {
    public static void main(String[] args) {
        test3();
    }
    static void test1() {
        Map<Integer, String> map = new CIS211Map<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.get(2)); // print "two"

        System.out.println(map.remove(2)); // print 2

        System.out.println(map.get(2)); // there's no longer a 2, so "null"
    }

    static void test2() {
        Map<String, String> map = new CIS211Map<>();
        map.put("Hello", "Hola");
        map.put("Bye", "Adios");
        map.put("One", "Uno");

        System.out.println(map.get("Hello"));
    }

    static void test3() {
        Map<Pokemon, String> map = new CIS211Map<>();

        map.put(new Pokemon("Pikachu", 150, 100), "Electric");
        map.put(new Pokemon("Charizard", 500, 300), "Fire");

        Pokemon pokemon = new Pokemon("Pikachu", 150, 100);

        System.out.println(map.get(pokemon));


    }

    static void comparableTest() {
        int num1 = 1;
        int num2 = 2;
        if (num1 < num2) {
            System.out.println("Num1 is less than num2");
        }

        Integer num3 = 3;
        Integer num4 = 4;

        if (num3.compareTo(num4) < 0) { // num3 < num4

        }
        if (num3.compareTo(num4) > 0) { // num3 > num4

        }
        if (num3.compareTo(num4) == 0) { // num3 == num4

        }
    }
}
