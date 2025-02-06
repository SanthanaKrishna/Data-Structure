package org.DSA.Graphs;

import java.util.*;

/**
 * ---Multisource BFS (Breadth-First Search)---
 * Multi-Source BFS is a variation of BFS where traversal starts from multiple source nodes simultaneously.
 * It is commonly used in problems like finding the shortest path from multiple starting points, spreading effects, or minimum steps in a grid.
 * Approach
 * Use a queue (Queue<int[]>) to store multiple sources.
 * Start BFS from all sources simultaneously (enqueue all sources at once).
 * Process each level together, ensuring shortest paths are found correctly.
 * Continue BFS normally.
 * Shortest path from S1 (0) to 9: 4 steps
 * Shortest path from S2 (1) to 9: 2 steps ✅ (Minimum)
 * Shortest path from S3 (5) to 9: 4 steps
 * Time Complexity	O(V + E) (each node & edge processed once)
 * Space Complexity	O(V) (for queue & distance array)
 */
public class MultiSourceBFS {
    private int vertices; // Number of vertices
    private List<List<Integer>> adjacencyList;  // Graph adjacency list

    public MultiSourceBFS(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    private void addEdge(int source, int destination) { // Add an edge to the graph
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // for undirected graph
    }

    public int findShortestPath(List<Integer> sources, int destination) { // Multi-Source BFS to find the shortest path to a destination
        int[] distance = new int[vertices];
        Arrays.fill(distance, -1); // Initialize all distances to -1 (unreachable)
        Queue<Integer> queue = new ArrayDeque<>();

        for (int source : sources) { // Start BFS from all sources
            queue.add(source);
            distance[source] = 0; // Distance from itself is 0
        }

        while (!queue.isEmpty()) { // Perform BFS
            int node = queue.poll();
            if (node == destination) { // If we reached the destination, return the distance
                return distance[node];
            }
            for (int neighbor : adjacencyList.get(node)) {  // Traverse all neighbors
                if (distance[neighbor] == -1) {  // if not visited
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
        return -1;  // Destination not reachable
    }

    public static void main(String[] args) {
        MultiSourceBFS graph = new MultiSourceBFS(13); // 0 to 12 nodes


        // Adding edges based on the given graph in the image
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 9); // Connection to destination
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 1);
        graph.addEdge(8, 10);
        graph.addEdge(10, 11);
        graph.addEdge(10, 12);

        // Sources
        List<Integer> sources = Arrays.asList(0, 1, 5); // S1, S2, S3
        int destination = 9; // Destination node

        // Compute shortest path
        int shortestDistance = graph.findShortestPath(sources, destination);

        // Output the result
        System.out.println("Shortest Distance from multiple sources to node " + destination + " is: " + shortestDistance);
    }
}


/**
 * When to Use Multi-Source BFS?
 * Shortest distance from multiple sources (e.g., nearest hospital, police station).
 * Flood fill algorithms (e.g., maze solving, shortest bridge).
 * Rotten oranges (spread simulation).
 */