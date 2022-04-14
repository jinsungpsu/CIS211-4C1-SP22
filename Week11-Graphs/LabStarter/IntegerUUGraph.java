public class IntegerUUGraph {
    private boolean[][] adjMatrix;

    public IntegerUUGraph(int numVertices) {
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true;
    }

    public boolean isConnected(int src, int dest) {
        return adjMatrix[src][dest];
    }
}
