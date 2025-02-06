package org.DSA.Graphs;

import java.util.*;

/**
 *  ---Breadth-First Search (BFS)---
 * Breadth-First Search (BFS) is a graph traversal algorithm that explores all vertices at the present depth level before moving on to the next depth level.
 * It uses a queue (FIFO) to track the next vertices to visit.
 * Approach
 * Create a queue (Queue<Integer>) for traversal.
 * Create a visited array i.e Mark nodes as visited using a visited[] array to avoid revisiting nodes.
 * Add src in queue (mark that src as visited arr) Start from a given source node, explore all its neighbors, then move to the next level.
 * 1.Remove,  2. Work,  3. Add unvisited neighbor
 * Time Complexity: O(V + E) (Each vertex and edge is processed once).
 * Space Complexity: O(V) (for visited[] and queue).
 */
public class BreadthFirstSearch {
    private int vertices;  // Number of vertices
    private List<List<Integer>> adjacentList; // Adjacency list representation

    public BreadthFirstSearch(int vertices) {
        this.vertices = vertices;
        adjacentList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacentList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination){  // Add an edge to the graph
        adjacentList.get(source).add(destination);
        adjacentList.get(destination).add(source); // for undirected graphs
    }

    public void bfs(int startNode){
        boolean[] visited= new boolean[vertices];  // to track visited nodes
        Queue<Integer> queue= new ArrayDeque<>(); // BFS queue

        queue.add(startNode); // add the node
        visited[startNode] = true; // start BFS the given node
        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()){
            int currentNode= queue.poll(); // dequeue node
            System.out.print(currentNode + " ");
            for(int neighbor: adjacentList.get(currentNode)){
                if(!visited[neighbor]) { // visited node is false, then
                visited[neighbor]= true;
                queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BreadthFirstSearch graph= new BreadthFirstSearch(6);
        // Creating an undirected graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        // Perform BFS from node 0
        graph.bfs(0);
    }
}


/**
 * Explanation
 * BFS from node 0 follows this order:
 * Start at 0, visit 1 and 2, add them to queue.
 * Visit 1, visit 3, add 3 to queue.
 * Visit 2, visit 4, add 4 to queue.
 * Visit 3, visit 5, add 5 to queue.
 * Visit 4 (no new neighbors).
 * Visit 5 (no new neighbors).
 * Why are we using LinkedList<> for the BFS queue?
 * Queue<Integer> queue = new LinkedList<>(); // BFS queue
 * 1️⃣ Queue Interface & LinkedList Implementation
 * Queue<> is an interface in Java that defines queue operations.
 * LinkedList<> is one of the implementations of the Queue interface.
 * We use LinkedList<> because it provides efficient enqueue (add()) and dequeue (poll()) operations.
 * 2️⃣ Why LinkedList instead of ArrayList?
 * Operation	LinkedList	ArrayList
 * add() (enqueue)	O(1) (insert at the tail)	O(1) (insert at the end)
 * poll() (dequeue)	O(1) (remove from head)	O(n) (shift elements)
 * In BFS, we frequently enqueue at the back and dequeue from the front.
 * LinkedList allows constant-time (O(1)) removal from the front, while ArrayList would require shifting all elements (O(n)) after every poll(), which is inefficient.
 * 3️⃣ Alternative: ArrayDeque<> (Better Choice)
 * Although LinkedList<> works fine, ArrayDeque<> is even better for queues:
 * Queue<Integer> queue = new ArrayDeque<>();
 * ArrayDeque<> is faster than LinkedList<> because it avoids node pointers overhead.
 * It provides O(1) enqueue/dequeue like LinkedList, but with better memory locality.
 * Conclusion:
 * LinkedList<> is used because it provides efficient O(1) enqueue & dequeue.
 * Better alternative: ArrayDeque<> (more efficient than LinkedList<>)
 */
