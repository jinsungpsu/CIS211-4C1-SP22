public class StupidLinkedList {
    public static void main(String[] args) {
        Node<Car> car1node = new Node<>();
        Node<Car> car2node = new Node<>();

        Car honda = new Car("Honda", "Civic");
        car1node.setData(honda);

        car2node.setData(new Car("Tesla", "Model 3"));

        car1node.setNext(car2node);

        car2node.setNext(new Node(new Car("Subaru", "WRX"), null));

        System.out.println();






//        System.out.println(car1node.getData());
//        System.out.println(honda);
//
//        honda.setModel("Accord");
//        System.out.println(honda);
//        System.out.println(car1node.getData());
//
//        car1node.getData().setModel("Ridgeline");
//        System.out.println(honda);
//        System.out.println(car1node.getData());

    }
}

class Node<T> {
    private T data;
    private Node next;

    public Node() {

    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}