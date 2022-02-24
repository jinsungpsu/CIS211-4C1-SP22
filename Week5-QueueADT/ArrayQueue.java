public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_SIZE = 5;
    private T[] queue;
    private int count = 0;
    private int front, back;

    public ArrayQueue() {
        queue = (T[])new Object[DEFAULT_SIZE];
    }

    public ArrayQueue(int size) {
        queue = (T[])new Object[size];
    }

    @Override
    public void enqueue(T it) {
        if (count < queue.length) {
            queue[back % queue.length] = it;
            count++;
            back++;
        } else {
            System.out.println("Sorry, full!");
        }
    }

    @Override
    public T dequeue() {
        count--;
        T frontItem = queue[front % queue.length];
        queue[front % queue.length] = null;
        front++;
        return frontItem;
    }

    @Override
    public T frontValue() {
        return null;
    }

    @Override
    public int length() {
        return 0;
    }

    public String toString() {
        String output = "[FRONT OF LINE]";
        // this is a bad version... please fix
        for (int i = 0; i < queue.length; i++) {
            output+=queue[i] + " ";
        }
        return output + "[BACK OF LINE]";
    }
}
