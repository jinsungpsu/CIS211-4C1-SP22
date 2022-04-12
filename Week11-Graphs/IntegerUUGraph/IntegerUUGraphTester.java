public class IntegerUUGraphTester {
    public static void main(String[] args) {
        IntegerUUGraph graph = new IntegerUUGraph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(5, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 2);

        if (graph.isConnected(4, 2)) {
            // true
        }

        if (graph.isConnected(4, 6)) {
            // false
        }

    }
}
