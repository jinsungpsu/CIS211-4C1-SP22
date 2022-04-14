public class IntegerUULinkedGraphTester {
    public static void main(String[] args) {
        IntegerUULinkedGraph graph = new IntegerUULinkedGraph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(4, 2);
    }
}
