public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;

    class Node<T extends Comparable<T>> {
        T data;
        Node left, right;

        public Node(T data) {
            this.data = data;
        }
    }

    public void insert(T item) {
        // special case - if the BST is empty, then just make the node the root
        if (root == null) {
            Node node = new Node(item);
            root = node;
        } else {
            //insert(item, root);
            insertIterative(item);
        }
    }

    private void insert(T item, Node<T> currNode) {
        // missing base case!
        if (item.compareTo(currNode.data) < 0 ) {
            // go left

            // have I "fallen off" the tree yet?
            if (currNode.left == null) {
                Node node = new Node(item);
                currNode.left = node;
            } else {
                // recursive case... keep going to a new subtree
                // with a new root of currNode.left
                insert(item, currNode.left);
            }
        } else {
            // go right
            if (currNode.right == null) {
                currNode.right = new Node(item);
            } else {
                insert(item, currNode.right);
            }
        }
    }

    private void insertIterative(T item) {
        boolean isFallen = false;
        Node<T> itr = root;
        while(true) {
            if (item.compareTo(itr.data) < 0) {
                if (itr.left == null) {
                    itr.left = new Node(item);
                    break;
                } else {
                    itr = itr.left;
                }
            } else {
                if (itr.right == null) {
                    itr.right = new Node(item);
                    break;
                } else {
                    itr = itr.right;
                }
            }
        }


    }
    public void inorder() {
        inorder(root);
    }

    private void inorder(Node currNode) {
        // base case
        if (currNode == null) {
            return;
        }

        // L V R

        // Left
        inorder(currNode.left);

        // process/Visit
        System.out.print(currNode.data + " ");

        // Right
        inorder(currNode.right);
    }
    public void preorder() {
        preorder(root);
    }
    private void preorder(Node currNode) {
        // base case
        if (currNode == null) {
            return;
        }

        // V L R

        // process/Visit
        System.out.print(currNode.data + " ");

        // Left
        inorder(currNode.left);

        // Right
        inorder(currNode.right);
    }

    public void postorder() {
        postorder(root);
    }
    private void postorder(Node currNode) {
        // base case
        if (currNode == null) {
            return;
        }

        // L V R

        // Left
        inorder(currNode.left);

        // Right
        inorder(currNode.right);

        // process/Visit
        System.out.print(currNode.data + " ");

    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        // 5 2 1 3 9
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);

        tree.inorder(); // 1,2,3
        System.out.println();
        tree.preorder(); // 1,2,3
        System.out.println();
        tree.postorder(); // 3,2,1
    }
}
