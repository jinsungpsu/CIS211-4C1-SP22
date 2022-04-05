public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;

    class Node<T extends Comparable<T>> {
        T data;
        Node left, right;
    }

    public void insert(T item) {
        insert(item, root);
    }

    private void insert(T item, Node<T> currNode) {
        // missing base case!

        if (item.compareTo(currNode.data) < 0 ) {
            // go left
            insert(item, currNode.left);
        } else {
            // go right
            insert(item, currNode.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
    }
}
