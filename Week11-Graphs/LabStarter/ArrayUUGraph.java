import java.util.ArrayList;
import java.util.HashMap;

public class ArrayUUGraph<T> implements UUGraph<T> {
    private boolean[][] adjMatrix;
    // if we wanted to make this weighted...
    // we'd create
    // private int[][] adjMatrix;

    // private ArrayList<ArrayList<Boolean>> adjArrList = new ArrayList<>();

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
// for a weighted graph
// public void addEdge(T src, T dest, int weight) {
        adjMatrix[map.get(src)][map.get(dest)] = true;
        adjMatrix[map.get(dest)][map.get(src)] = true; // take this out for a directed graph

        // for weighted graphs, instead of setting to true, we'll set it to the weight
        /*
        adjMatrix[map.get(src)][map.get(dest)] = weight;
        adjMatrix[map.get(dest)][map.get(src)] = weight; // take this out for a directed graph

         */
    }
}
