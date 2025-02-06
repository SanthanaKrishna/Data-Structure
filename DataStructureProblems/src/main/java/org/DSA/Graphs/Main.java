package org.DSA.Graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);   // Create a graph with 6 vertices

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        graph.displayGraph();
        // Perform DFS (Recursive)
        DepthFirstSearch.dfsRecursive(graph, 0);

        // Perform DFS (Iterative)
        DepthFirstSearch.dfsIterative(graph, 0);
    }
}
