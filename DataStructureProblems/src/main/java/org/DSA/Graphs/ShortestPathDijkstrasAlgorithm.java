package org.DSA.Graphs;

import java.util.*;

/**
 * Find the shortest path of each node
 * Dijkstra’s Algorithm works on an undirected graph unless explicitly mentioned.
 * Dijkstra will focus on current shortest path
 */
public class ShortestPathDijkstrasAlgorithm {
    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static int findMinWeightEachVertices(List<List<Edge>> graph, int vertices, int source, int destination) {
        int[] distance = new int[vertices]; // Stores min distance to each node
        Arrays.fill(distance, Integer.MAX_VALUE); // store infinite value for each array value
        distance[source] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // comparator ensures that the smallest distance value (a[1]) is always processed first.
        minHeap.add(new int[]{source, 0}); //(Node, Distance);

        while (!minHeap.isEmpty()) {
            // step1: remove
            int[] current = minHeap.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            if (currentNode == destination) {  // If we reached the destination, return the distance
                System.out.println("Distance between each vertices:" + Arrays.toString(distance));
                return currentDistance;
            }
            // Explore neighbors
            for (Edge neighbor : graph.get(currentNode)) {
                int newDistance = currentDistance + neighbor.weight;
                // If a shorter path to neighbor is found, update it
                if (newDistance < distance[neighbor.destination]) {
                    distance[neighbor.destination] = newDistance;  // step 3:update the distance
                    minHeap.add(new int[]{neighbor.destination, newDistance});  // step 4: add unvisited neighbor
                }
            }
        }
        return (distance[destination] == Integer.MAX_VALUE) ? -1 : distance[destination];// If no path exists, return -1
    }

    public static void main(String[] args) {
        int vertices = 5;  // Number of vertices (0 to 7)
        List<List<Edge>> graph = new ArrayList<>();
        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        // Adding edges (source, destination, weight)
//        graph.get(0).add(new Edge(1, 7));
//        graph.get(0).add(new Edge(2, 8));
//
//        graph.get(1).add(new Edge(3, 2));
//
//        graph.get(2).add(new Edge(3, 4));
//        graph.get(2).add(new Edge(5, 6));
//
//        graph.get(3).add(new Edge(4, 2));
//        graph.get(3).add(new Edge(5, 2));
//
//        graph.get(4).add(new Edge(6, 5));
//
//        graph.get(5).add(new Edge(6, 8));
//        graph.get(5).add(new Edge(7, 2));
//
//        graph.get(6).add(new Edge(7, 6));

        //---------------------------- output for below one is 7
        graph.get(0).add(new Edge(1, 2));
        graph.get(1).add(new Edge(0, 2));  // Reverse direction

        graph.get(0).add(new Edge(3, 6));
        graph.get(3).add(new Edge(0, 6));  // Reverse direction

        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));  // Reverse direction

        graph.get(1).add(new Edge(3, 8));
        graph.get(3).add(new Edge(1, 8));  // Reverse direction

        graph.get(1).add(new Edge(4, 5));
        graph.get(4).add(new Edge(1, 5));  // Reverse direction

        graph.get(2).add(new Edge(4, 7));
        graph.get(4).add(new Edge(2, 7));  // Reverse direction

        graph.get(3).add(new Edge(4, 9));
        graph.get(4).add(new Edge(3, 9));  // Reverse direction
        //---------------------------
        // Display adjacency list
        for (int i = 0; i < vertices; i++) {
            System.out.print("Node " + i + ": ");
            for (Edge edge : graph.get(i)) {
                System.out.print(" -> (" + edge.destination + ", " + edge.weight + ")");
            }
            System.out.println();
        }

        int source = 0, destination = vertices-1;
        int minWeight = findMinWeightEachVertices(graph, vertices, source, destination);
        if (minWeight == Integer.MAX_VALUE) {
            System.out.println("No path exists between " + source + " and " + destination);
        } else {
            System.out.println("Minimum weight required to travel from " + source + " to " + destination + " is: " + minWeight);
        }
    }
}
