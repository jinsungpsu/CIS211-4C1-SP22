public class ArrayMap<K extends Comparable<K>, V> implements Map<K, V> {

    private K[] keys;
    private V[] values;
    private int count = 0;

    @Override
    public V get(K key) {
        // linear search
        for (int i = 0; i < count; i++) {
            if (key.compareTo(keys[i]) == 0) {
                return values[i];
            }
        }

        // binary search is FASTER!!!
        return null;
    }

    @Override
    public V put(K key, V value) {
        keys[count++]= key;
        values[count++] = value;
        return value;
    }

    @Override
    public V remove(K key) {
        return null;
    }
}
