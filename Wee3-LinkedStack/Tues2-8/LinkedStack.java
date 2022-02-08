public class LinkedStack<T> implements Stack<T> {
    private Node<T> head;

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // if stack is empty
        // we will create a node and assign to head
        if (head == null) {
            // create a node
            // put the item in the node
            // make sure the next = null
        } else {
            // if there's something already there, then we have to connect it
            // to the existing linked nodes

            // create a node
            // put the item in the node
            // connect this node to the existing chain
            // https://visualgo.net/en/list
        }
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }
}
