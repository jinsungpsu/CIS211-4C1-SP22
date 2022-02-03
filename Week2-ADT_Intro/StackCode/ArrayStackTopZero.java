public class ArrayStackTopZero<T> implements Stack<T> {

    // index 0 is TOP of stack

    private final int DEFAULT_SIZE = 5;
    private T[] stack;

    public ArrayStackTopZero() {
        stack = (T[])new Object[DEFAULT_SIZE];
    }

    public ArrayStackTopZero(int size) {
        stack = (T[])new Object[size];
    }

    @Override
    public void push(T item) throws UnsupportedOperationException {
        // this only works when the stack is EMPTY
        stack[0] = item;

        // when pushing a second item... the first item will be overwritten
        // we must shift everything over to the right
    }

    @Override
    public T pop() {
        T theTopThing = stack[0];

        // we must shift everything over to the left

        return theTopThing;
    }

    @Override
    public T peek() {
        // how do I return the top item?
        // the "top" is index 0 right????????

        T theTopThing = stack[0];

        return theTopThing;
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
