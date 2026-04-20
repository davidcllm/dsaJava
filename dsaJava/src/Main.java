import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Adjacency matrix
        //runtime complexity to check an edge: O(1)
        //space complexity: O(v^2)

        Graph graph = new Graph(5);
        graph.addNode(new Node("A"));
        graph.addNode(new Node("B"));
        graph.addNode(new Node("C"));
        graph.addNode(new Node("D"));
        graph.addNode(new Node("E"));

        graph.addEdge(0, 1);

    }
}

