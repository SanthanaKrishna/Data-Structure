package org.DSA.Graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * ## List<List<Integer>> adjacencyList -   A list of lists, where each index represents a vertex, and the inner list contains all the neighboring vertices of that vertex.
 * Example: For a graph with 4 vertices:
 * 0 → 1, 2
 * 1 → 0, 3
 * 2 → 0
 * 3 → 1
 * This represented as : adjacencyList = [
 * [1, 2],  // Vertex 0's neighbors
 * [0, 3],  // Vertex 1's neighbors
 * [0],     // Vertex 2's neighbors
 * [1]      // Vertex 3's neighbors
 * ];
 * Constructor: Creates an empty LinkedList for each vertex to store its neighbors.
 * Example: If vertices = 4, the adjacency list starts as:  adjacencyList = [[], [], [], []];
 */
public class Graph {
    private int vertices;  // Number of vertices
    private List<List<Integer>> adjacencyList; // Adjacency List representation

    public Graph(int vertices) {  // Constructor
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) { //adjacencyList = [[], [], [], []];
            adjacencyList.add(new ArrayList<>());  //Creates an empty LinkedList for each vertex to store its neighbors.
        }
    }

    // Add edge
    public void addEdge(int source, int destination) {  // Add edge to the graph (Undirected by default)
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);  // Remove this line for directed graphs
    }

    public void addEdgeDirected(int source, int destination) {  // Add edge to the graph
        adjacencyList.get(source).add(destination);
    }


    public List<List<Integer>> getAdjacencyList() {  // Get adjacency list
        return adjacencyList;
    }

    public int getVertices() {  // Get number of vertices
        return vertices;
    }

    public void displayGraph() {  // Display the graph
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }
}
