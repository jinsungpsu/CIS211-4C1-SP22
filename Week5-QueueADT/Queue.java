/**
 * Queue ADT
 * based on https://people.cs.vt.edu/shaffer/Book/JAVA3elatest.pdf
 * Page 125
 */
public interface Queue<E> {
    /**
     * Place an element at the rear of the queue.
     Sample run:
     *
     * @param it The element being enqueued.
     */
    public void enqueue(E it);
    /**
     * Remove and return element at the front of the queue.
     *
     * @return The element at the front of the queue.
     */
    public E dequeue();
    /**
     * @return The front element.
     */
    public E frontValue();
    /**
     * @return The number of elements in the queue.
     */
    public int length();
}
