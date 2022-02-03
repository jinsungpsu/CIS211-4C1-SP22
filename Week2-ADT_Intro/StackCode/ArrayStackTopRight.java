// this is the array based stack you should start with
// you should probably name it better, though

public class ArrayStackTopRight<T> implements Stack<T> {

    // The TOP of stack is on the right side of array and keeps changing
    private int numItems = 0;

    private final int DEFAULT_SIZE = 5;
    private T[] stack;

    public ArrayStackTopRight() {
        stack = (T[])new Object[DEFAULT_SIZE];
    }

    public ArrayStackTopRight(int size) {
        stack = (T[])new Object[size];
    }

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // we should if there is "room" in the array
        // we should increment the counter/indexOfTop
        // store the item in the array

        if (numItems < stack.length) {
            stack[numItems] = item;
            numItems++;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public T pop() {
        // work on this... make sure you update numItems and return the item on top
        return null;
    }

    @Override
    public T peek() {
        // work on this - return item, but DON'T take anything out of array
        return null;
    }

    @Override
    public boolean isEmpty() {
        // work on this
        return false;
    }

    @Override
    public int length() {
        return numItems;
    }
}
