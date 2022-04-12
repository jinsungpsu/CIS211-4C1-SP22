import java.util.HashMap;

public class ArrayUUGraph<T> implements UUGraph<T> {
    private boolean[][] adjMatrix;
    private HashMap<T, Integer> map = new HashMap<>();
    private int count=0;

    public ArrayUUGraph(int numVertices) {
        adjMatrix = new boolean[numVertices][numVertices];
    }

    @Override
    public void addVertex(T item) {
        map.put(item, count++);
    }

    @Override
    public void addEdge(T src, T dest) {
        adjMatrix[map.get(src)][map.get(dest)] = true;
        adjMatrix[map.get(dest)][map.get(src)] = true;
    }
}
