public class LinkedDeque<T> implements Deque<T> {
    private Node head, tail;
    private int size = 0;
    // head of linked list = front of the deque
    // tail of linked list = back of the deque

    @Override
    public boolean offerFirst(T item) {
        // if it's empty do something
        Node node = new Node();
        node.data = item;
        node.next = null;
        node.prev = null;
        if (isEmpty()) {
            // this new node
            // which is the only node
            // will be both the head and the tail
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            // head.prev = node; // this is not good... we end up with 1st node in list with prev reference back to self
            // node.prev = head; // this is not good... we end up with 1st node in list with prev reference back to self
        }

        // if it's not empty... add it to the front...
        // by creating a new node
        // and then "pushing" everything back
        // by re-assigning the head to this new node
        // and connecting it to the rest of the linked nodes
        size++;
        return true;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return !(size() > 0);
        // return (head==null);
//        if (head==null) {
//            // this means DLL is empty
//            return true;
//        } else {
//            return false;
//        }

    }

    class Node {
        T data;
        Node next, prev;
    }
}
