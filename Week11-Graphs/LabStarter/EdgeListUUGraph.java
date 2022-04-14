import java.util.ArrayList;

public class EdgeListUUGraph<T> implements UUGraph<T> {
    private ArrayList<Edge> edges = new ArrayList<>();

    @Override
    public void addVertex(T item) {

    }

    @Override
    public void addEdge(T src, T dest) {
        // assume no duplicates
        Edge edge = new Edge(src, dest);
        // for weighted graph, third parameter for weight needed
        edges.add(edge);
    }

    class Edge {
        T src, dest;

        // if weighted
        // int weight;

        public Edge(T src, T dest) {
            this.src = src;
            this.dest = dest;
        }
    }
}
