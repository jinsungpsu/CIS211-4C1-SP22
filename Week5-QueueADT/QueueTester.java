public class QueueTester {
    public static void main(String[] args) {
        Queue<Integer> numQ = new ArrayQueue<>();

        numQ.enqueue(1);
        numQ.enqueue(2);
        numQ.enqueue(3);
        numQ.enqueue(4);
        numQ.enqueue(5);

        System.out.println(numQ);

        System.out.println();
        System.out.println(numQ.dequeue()); // display 1
        System.out.println(numQ.dequeue()); // display 2
        System.out.println(numQ.dequeue()); // display 3

        numQ.enqueue(6);
        numQ.enqueue(7);
        numQ.enqueue(8);
        System.out.println(numQ);
        numQ.enqueue(9); // this one should crash
    }
}
