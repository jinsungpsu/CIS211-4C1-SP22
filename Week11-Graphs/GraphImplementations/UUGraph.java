import java.util.List;

public interface UUGraph<T> {
    public void addVertex(T item);

    public void addEdge(T src, T dest);

    // public boolean contains(T item);

    // public List<T> path(T src, T dest);
}
