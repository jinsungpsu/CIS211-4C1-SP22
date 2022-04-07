public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {
    private Node root;

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    class Node {
        K key;
        V value;
    }
}
