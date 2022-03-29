import java.util.ArrayList;

public class LinkedTreeNode<T> {
    private T data;
    private ArrayList<LinkedTreeNode> children = new ArrayList<>();

    public boolean contains(T item) {
        if (data.equals(item)) {
            return true;
        } else {
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i).contains(item))
                    return true;
            }
            return false;
        }
    }

    public LinkedTreeNode(T item) {
        data = item;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<LinkedTreeNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<LinkedTreeNode> children) {
        this.children = children;
    }

    public String toString2() {
        return "\nLinkedTreeNode{" +
                "data=" + data +
                ", children=" + children +
                '}';
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.data + " ");

    }


}
