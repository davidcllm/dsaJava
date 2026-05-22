import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Breadth First Search: traverse a graph level by level

        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
        System.out.println();

        //graph.breadthFirstSearch(0);
        //graph.breadthFirstSearch(1);
        //graph.breadthFirstSearch(2);
        graph.breadthFirstSearch(3);
        //graph.breadthFirstSearch(4);
    }
}
