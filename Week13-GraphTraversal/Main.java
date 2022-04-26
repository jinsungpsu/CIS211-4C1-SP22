import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>(7);

        for (int i = 0; i < 7; i++) {
            graph.addVertex(i);
        }

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 1);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);


        System.out.println(graph.getNeighbors(0));
        // 1 and 2

        graph.depthFirstTraversal(0);

        // graph.depthFirstTraversal_solution(0);
        // 6 5 4 3 2 1 0
        // we can take advantage of stack

        // graph.breadthFirstTraversal_solution(0);
        // 0 1 2 3 4 5 6
        // we can take advantage of queue

    }
}
