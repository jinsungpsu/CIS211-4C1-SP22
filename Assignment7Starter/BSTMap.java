public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {
    private Node root;

    @Override
    public V get(K key) {
        // in here, you also need to output how many comparisons it took to "get" that particular item
        return null;
    }

    @Override
    public V put(K key, V value) {

        boolean isFallen = false;
        Node itr = root;
        while(true) {
            if (key.compareTo(itr.key) < 0) {
                if (itr.left == null) {
                    itr.left = new Node(key, value);
                    break;
                } else {
                    itr = itr.left;
                }
            } else {
                if (itr.right == null) {
                    itr.right = new Node(key, value);
                    break;
                } else {
                    itr = itr.right;
                }
            }
        }
        return value;
    }

    class Node {
        K key;
        V value;
        Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}