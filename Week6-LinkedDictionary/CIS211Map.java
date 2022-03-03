public class CIS211Map<K extends Comparable<K>, V> implements Map<K, V> {
    private Node head;
    private int size;

    @Override
    public V get(K key) {
        // loop through our list to find
        // what key we're looking for...

        // loop while next != null
        // we've reached the tail

        Node itr = head;

        while (itr != null) {
            if (itr.key.compareTo(key) == 0) {
                // itr.key == key;
                return itr.value;
            }
            itr = itr.next;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Node node = new Node();
        node.key = key;
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
        return value;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    class Node {
        K key;
        V value;
        Node next;
    }
}
