package org.DSA.Graphs;

public class CycleDetection {
    public static boolean hasCycle(Graph graph) { // Function to check if the graph has a cycle using DFS
        int vertices = graph.getVertices();
        boolean[] visited = new boolean[vertices];
        boolean[] recStack = new boolean[vertices]; //Recursion stack

        for (int i = 0; i < vertices; i++) {  // Check each node in case the graph is disconnected
            if (!visited[i]) {
                if (dfs(graph, i, visited, recStack)) {
                    return true;  // cycle detected
                }
            }
        }
        return false;  // No cycle found
    }

    private static boolean dfs(Graph graph, int node, boolean[] visited, boolean[] recStack) { // Recursive DFS function to detect a cycle
        // Mark current node as visited and add to recursion stack
        visited[node] = true;
        recStack[node] = true;
        for (int neighbor : graph.getAdjacencyList().get(node)) { // Check all adjacent nodes
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, visited, recStack)) {
                    return true;  //Cycle detected
                }
            } else if (recStack[neighbor]) {
                return true;  //Cycle detected (back edge found)
            }
        }
        recStack[node] = false;  // Remove node from recursion stack before returning
        return false;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        // Creating a directed graph
        graph.addEdgeDirected(0, 1);
        graph.addEdgeDirected(1, 2);
        graph.addEdgeDirected(2, 3);
        graph.addEdgeDirected(3, 1);  // This creates a cycle (3 -> 1)

        // Check if the graph has a cycle
        if (CycleDetection.hasCycle(graph)) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does NOT contain a cycle.");
        }
    }
}
