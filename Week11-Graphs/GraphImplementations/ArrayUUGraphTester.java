public class ArrayUUGraphTester {
    public static void main(String[] args) {
        ArrayUUGraph<Integer> graph = new ArrayUUGraph(7);

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(5, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 2);

        ArrayUUGraph<String> sGraph = new ArrayUUGraph<>(2);
        sGraph.addVertex("Hello");
        sGraph.addVertex("World");
        sGraph.addEdge("Hello", "World");


    }
}
