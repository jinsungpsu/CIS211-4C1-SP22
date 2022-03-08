public class HashMapTester {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Hola");
        map.put("Bye", "Adios");
        map.put("One", "Uno");

        System.out.println(map.get("Hello"));
        System.out.println(map.get("Bye"));
        System.out.println(map.get("One"));

    }
}
