public class LinkedStack<T> implements Stack<T> {
    private Node head;

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // if stack is empty
        // we will create a node and assign to head
        Node node = new Node(item);

        if (head == null) {
            // create a node
            // put the item in the node
            // make sure the next = null
            node.next = null;
        } else {
            // if there's something already there, then we have to connect it
            // to the existing linked noes
            node.next = head;

            // create a node
            // put the item in the node
            // connect this node to the existing chain
            // https://visualgo.net/en/list

            // NOT THIS
            // head = node.getNext();
        }
        head = node;
    }

    @Override
    public T pop() {
        Node returnNode = head;

        head = head.next;

        // set the previous head's next to null
        returnNode.next = null;

        return returnNode.data;
    }

    @Override
    public T peek() {
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public String toString() {
        String output = "\nContents of this stack are: \n[TOP]";

        Node currNode = head;
        while(currNode != null) {
            output += "\n"+currNode.data + " ";
            currNode = currNode.next;
        }

        output+="\n[BOTTOM]";

        return output;
    }

    class Node {
        private T data;
        private Node next;

        Node(T item) {
            data = item;
        }

    }
}
