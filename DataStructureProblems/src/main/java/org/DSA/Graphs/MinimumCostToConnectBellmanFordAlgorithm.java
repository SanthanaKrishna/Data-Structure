package org.DSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinimumCostToConnectBellmanFordAlgorithm {
    static class Edge {
        int source, destination, weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

    }

    int vertices;
    List<Edge> edges;

    public MinimumCostToConnectBellmanFordAlgorithm(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public void bellmanFord(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0; // Distance to the source is always 0

        // Step 1: Relax all edges |V| - 1 times
        for (int i = 0; i < vertices - 1; i++) {
            for (Edge edge : edges) {
                if (distance[edge.source] != Integer.MAX_VALUE &&
                        distance[edge.source] + edge.weight < distance[edge.destination]) {
                    distance[edge.destination] = distance[edge.source] + edge.weight;
                }
            }
        }

        // Step 2: Detect Negative Cycles
        for (Edge edge : edges) {
            if (distance[edge.source] != Integer.MAX_VALUE &&
                    distance[edge.source] + edge.weight < distance[edge.destination]) {
                System.out.println("Negative weight cycle detected!");
                return;
            }
        }

        // Print shortest path to all vertices
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + " → " + (distance[i] == Integer.MAX_VALUE ? "∞" : distance[i]));
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        MinimumCostToConnectBellmanFordAlgorithm graph = new MinimumCostToConnectBellmanFordAlgorithm(vertices);
//        graph.addEdge(0, 1, -1);
//        graph.addEdge(0, 2, 4);
//        graph.addEdge(1, 2, 3);
//        graph.addEdge(1, 3, 2);
//        graph.addEdge(1, 4, 2);
//        graph.addEdge(3, 2, 5);
//        graph.addEdge(3, 1, 1);
//        graph.addEdge(4, 3, -3);


        // Adding edges (source, destination, weight)
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 3, -3);
        graph.addEdge(2, 1, 6);
        graph.addEdge(3, 2, -2);
        graph.addEdge(3, 4, 3);

        graph.bellmanFord(0);
    }
}
