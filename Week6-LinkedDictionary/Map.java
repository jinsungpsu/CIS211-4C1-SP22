public interface Map<K extends Comparable<K>, V> {
    public V get(K key);

    public V put(K key, V value);

    public V remove(K key);
}
