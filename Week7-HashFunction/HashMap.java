public class HashMap<K extends Comparable<K>, V> implements Map<K, V> {
    private final int DEFAULT_CAPACITY = 50;
    private V[] dictionary;

    public HashMap() {
        dictionary = (V[]) new Object[DEFAULT_CAPACITY];
    }

    public HashMap(int size) {
        dictionary = (V[]) new Object[size];
    }

    @Override
    public V get(K key) {
        int index = hashFunction(key);
        return dictionary[index];
    }

    @Override
    public V put(K key, V value) {
        int index = hashFunction(key);
        dictionary[index] = value;
        return value;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    private int hashFunction(K key) {
        // takes a key
        // does some magic
        // returns an integer
        if (key.equals("Hello")) return 49;
        if (key.equals("Bye")) return 14;
        if (key.equals("One")) return 20;

        return -1;
    }
}
