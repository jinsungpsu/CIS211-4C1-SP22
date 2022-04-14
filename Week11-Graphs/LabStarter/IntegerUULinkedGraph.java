import java.util.LinkedList;

public class IntegerUULinkedGraph {
    private LinkedList[] adjList;

    public IntegerUULinkedGraph(int numVertices) {
        adjList = new LinkedList[numVertices];
    }

    public void addEdge(int src, int dest) {
        if (adjList[src] == null) {
            adjList[src] = new LinkedList();
        }

        boolean destExists = false;
        for (int i = 0; i < adjList[src].size(); i++) {
            if (adjList[src].get(i).equals(dest)) {
                // edge already exists
                destExists = true;
            }
        }
        if (!destExists)
            adjList[src].add(dest);


        // in a directed graph, we can take this whole second section out
        if (adjList[dest] == null) {
            adjList[dest] = new LinkedList();
        }

        for (int i = 0; i < adjList[dest].size(); i++) {
            if (adjList[dest].get(i).equals(src)) {
                // edge already exists
                return;
            }
        }
        adjList[dest].add(src);

    }

    private void addEdgeOneWay(int src, int dest) {

    }
}
