package org.DSA.Graphs;

import java.util.Stack;

/**
 * Depth-First Search (DFS)
 * Description: DFS explores as far as possible along one branch before backtracking.
 * Key Characteristics:
 * Uses a stack (explicit or recursion) to keep track of the vertices.
 * Suitable for finding connected components, detecting cycles, and performing topological sorting.
 * Time Complexity:  O(V+E).
 */
public class DepthFirstSearch {

    // Recursive DFS
   public static void dfsRecursive(Graph graph, int startVertex){
       boolean[] visited= new boolean[graph.getVertices()];
       System.out.print("DFS Recursive Traversal: ");
       dfsUtil(graph, startVertex, visited);
       System.out.println();
   }

   private static void dfsUtil(Graph graph, int vertex, boolean[] visited){ // DFS Helper Method
       visited[vertex] = true;  // Mark the vertex as visited
       System.out.print(vertex + " ");  // Process the vertex

       for (int neighbor: graph.getAdjacencyList().get(vertex)){ // Recur for all neighbors
           if(!visited[neighbor]){
               dfsUtil(graph, neighbor, visited);
           }
       }
   }

    // Iterative DFS
   public static void dfsIterative(Graph graph, int startVertex){
       boolean[] visited = new boolean[graph.getVertices()];
       Stack<Integer> stack = new Stack<>();
       stack.push(startVertex);

       System.out.print("DFS Iterative Traversal: ");
       while (!stack.isEmpty()){
           int vertex= stack.pop();
           if(!visited[vertex]){
               visited[vertex]= true;
               System.out.print(vertex+ " ");

               for (int neighbor: graph.getAdjacencyList().get(vertex)){
                   if(!visited[neighbor]){
                       stack.push(neighbor);
                   }
               }
           }
       }
       System.out.println();
   }

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
