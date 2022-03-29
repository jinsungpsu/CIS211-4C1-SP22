public interface Tree<T> {
    public void addNode(T item);

    public boolean contains(T item);

    public boolean remove(T item);
}
