package org.DSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Adjacency Matrix:
 * A 2D array where matrix[i][j] represents the presence (and possibly weight) of an edge between vertices i and j.
 * Advantages: Simple, fast lookups for edge existence.
 * Disadvantages: Space-inefficient for sparse graphs.
 * Explanation : Adjacency List:
 * Each vertex has a list of neighbors.
 * For example, vertex 0 connects to vertices 1 and 4.
 * Space Complexity:
 * The adjacency list uses O(V+E), where V is the number of vertices and E is the number of edges.
 * Time Complexity:
 * Adding an edge:O(1) for each edge (constant-time insertion into a list).
 * Displaying the graph: O(V+E).
 */
public class AdjacencyMatrix {
    private int vertices;  // Number of vertices
    private List<List<Integer>> adjacencyList;  // Adjacency List representation

    public AdjacencyMatrix(int vertices) { //Constructor
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {// Initialize each vertex's adjacency list
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {  // Method to add an edge (undirected graph)
        adjacencyList.get(source).add(destination); // Add destination to source's list
        adjacencyList.get(destination).add(source);  // Add source to destination's list (for undirected graph)
    }

    public void displayGraph() {  // Method to display the graph
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(" ->" + neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5); // Create a graph with 5 vertices
        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Display the graph
        graph.displayGraph();
    }
}
