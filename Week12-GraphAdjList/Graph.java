import java.util.*;

public class Graph<T> {
    private LinkedList[] adjList;
    private HashMap<T, Integer> vertices = new HashMap<>();
    private HashMap<Integer, T> revVerticesMap = new HashMap<>();
    private int count = 0;

    public Graph(int numVertices) {
        adjList = new LinkedList[numVertices];
    }

    public void addVertex(T vertex) {
        vertices.put(vertex, count);
        revVerticesMap.put(count, vertex);
        count++;
    }

    public void addEdge(T src, T dest) {
        if (adjList[vertices.get(src)] == null) {
            adjList[vertices.get(src)] = new LinkedList();
        }

        boolean destExists = false;
        for (int i = 0; i < adjList[vertices.get(src)].size(); i++) {
            if (adjList[vertices.get(src)].get(i).equals(dest)) {
                // edge already exists
                destExists = true;
            }
        }
        if (!destExists)
            adjList[vertices.get(src)].add(dest);


        // in a directed graph, we can take this whole second section out
        if (adjList[vertices.get(dest)] == null) {
            adjList[vertices.get(dest)] = new LinkedList();
        }

        for (int i = 0; i < adjList[vertices.get(dest)].size(); i++) {
            if (adjList[vertices.get(dest)].get(i).equals(vertices.get(src))) {
                // edge already exists
                return;
            }
        }
        adjList[vertices.get(dest)].add(vertices.get(src));

    }

    public List<T> getNeighbors(T vertex) {
        int index = vertices.get(vertex);
        LinkedList neighbors = adjList[index];

//        T[] neighborsArr = (T[])new Object[neighbors.size()] ;
//
//        for (int i = 0; i < neighbors.size(); i++) {
//            neighborsArr[i] = revVerticesMap.get(neighbors.get(i));
//        }
//
//        return neighborsArr;
        ArrayList<T> neighborsArr = new ArrayList<>();
        for (int i = 0; i < neighbors.size(); i++) {
            neighborsArr.add(revVerticesMap.get(neighbors.get(i)));
        }

        return neighborsArr;
    }

    public void depthFirstTraversal(T src) {
        ArrayList<T> visited = new ArrayList<>();
        Stack<T> verticesStack = new Stack<>();

        verticesStack.push(src);
        visited.add(src);

        // loop, is my stack empty?
        while(!verticesStack.isEmpty()) {

            // if all neighbors are visited, we pop from the stack

            // take next neighbor and push it on to the stack

            // update the visited list

            // "process"

        }



    }

}
