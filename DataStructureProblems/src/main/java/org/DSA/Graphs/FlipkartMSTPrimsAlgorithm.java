package org.DSA.Graphs;

import java.util.*;

/**
 * --- Prim's Algorithm for Minimum Spanning Tree (MST) in a weighted graph. ---
 * Prim’s Algorithm Explanation
 * Prim’s Algorithm finds the minimum cost to connect all nodes in a weighted graph.
 * It uses a priority queue (Min Heap) to always select the minimum weight edge
 * 1.Start with any center (node).
 * 2.Use a priority queue (Min Heap) to always select the cheapest road.
 * 3.Expand the network by adding the smallest-cost connection that doesn't form a cycle.
 * 4.Repeat until all centers are connected
 * Scenario:
 * Flipkart has N local distribution centers spread across a large metropolitan city.
 * These centers need to be interconnected for the efficient movement of goods.
 * However, building and maintaining roads between these centers is costly.
 * Flipkart’s goal is to minimize these costs while ensuring that every center is connected and operational.
 * Goal:
 * You are given a number of centers and possible connections that can be made along with their costs.
 * Find the minimum cost of constructing roads between centers such that it is possible to travel from one center to any other via roads.\
 */

public class FlipkartMSTPrimsAlgorithm {
    static class Edge {
        int destination, weight;

        Edge(int destination, int weight) {
            this.destination = destination;  // next center
            this.weight = weight;  // cost of road
        }
    }

    public static int minimumCostToConnectCenters(int totalCenters, List<int[]> connections) {
        //create adjacency list representation of the graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < totalCenters; i++) {
            graph.add(new ArrayList<>());
        }

        // step 2:  Adding Connections (Edges) : Add edges to the graph (Bidirectional)
        for (int[] connection : connections) {
            int center1 = connection[0];
            int center2 = connection[1];
            int cost = connection[2];

            graph.get(center1).add(new Edge(center2, cost));
            graph.get(center2).add(new Edge(center1, cost));
        }

        // **Step 1: Use a Priority Queue to select the minimum cost edge**
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e[1]));  //The node with the smallest cost is always processed first.
        boolean[] visited = new boolean[totalCenters]; // Tracks visited centers
        int totalCost = 0;// Minimum cost of roads
        int edgesUsed = 0;// Count of edges added to MST

        // Start from center 0
        minHeap.offer(new int[]{0, 0});

        while (!minHeap.isEmpty() && edgesUsed < totalCenters) {
            int[] current = minHeap.poll();
            int center = current[0];
            int cost = current[1];

            if (visited[center]) continue; // Skip if already visited

            //Mark as visited and add cost
            visited[center] = true;
            totalCost += cost;
            edgesUsed++;

            // Add all adjacent edges to the priority queue
            for (Edge edge : graph.get(center)) {
                if (!visited[edge.destination]) {
                    minHeap.offer(new int[]{edge.destination, edge.weight});
                }
            }
        }

        // If not all centers are connected, return -1 (i.e., no valid MST)
        return (edgesUsed == totalCenters) ? totalCost : -1;
    }

    public static void main(String[] args) {
        int totalCenters = 5;
        List<int[]> connections = Arrays.asList(
                new int[]{0, 1, 2},
                new int[]{0, 3, 6},
                new int[]{1, 2, 3},
                new int[]{1, 3, 8},
                new int[]{1, 4, 5},
                new int[]{2, 4, 7}
        );
        int minCost = minimumCostToConnectCenters(totalCenters, connections);
        System.out.println("Minimum cost to connect all centers: " + minCost);
    }
}
