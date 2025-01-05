package org.DSA.Heaps;

import java.util.PriorityQueue;

/**
 * ##Connect ropes
 * Problem Description
 * You are given an array A of integers that represent the lengths of ropes.
 * You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
 * Find and return the minimum cost to connect these ropes into one rope.
 * Input 1:  A = [1, 2, 3, 4, 5]   Output 1: 33
 * Input 2:  A = [5, 17, 100, 11]  Output 2:  182
 * Explanation 1: Given array A = [1, 2, 3, 4, 5].
 * Connect the ropes in the following manner:
 * 1 + 2 = 3
 * 3 + 3 = 6
 * 4 + 5 = 9
 * 6 + 9 = 15
 * So, total cost  to connect the ropes into one is 3 + 6 + 9 + 15 = 33.
 * Explanation 2:  Given array A = [5, 17, 100, 11].
 * Connect the ropes in the following manner:
 * 5 + 11 = 16
 * 16 + 17 = 33
 * 33 + 100 = 133
 * So, total cost  to connect the ropes into one is 16 + 33 + 133 = 182.
 */
public class ConnectingRopes {
    // Function to calculate the minimum cost of connecting the ropes
    public static int minCostToConnectRopes(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Initialize a min-heap (priority queue) to store the rope lengths

        for (int rope : ropes) { // Add all ropes to the heap
            minHeap.offer(rope);
            System.out.println(minHeap);
        }
        System.out.println(minHeap);
        int totalCost = 0;

        while (minHeap.size() > 1) { // While there is more than one rope, continue merging
            // Extract the two smallest ropes
            int first = minHeap.poll();  // Removes and returns the smallest element in the heap
            int second = minHeap.poll();

            // The cost to connect them is the sum of their lengths
            int mergeCost = first + second;
            totalCost += mergeCost;

            // Insert the new rope (merged one) back into the heap
            minHeap.offer(mergeCost);
        }
        return totalCost; // The total cost of connecting all ropes
    }

    public static void main(String[] args) {
        // Example array of rope lengths
//        int[] ropes = {4, 3, 2, 6};
        int[] ropes = {2, 5, 3, 2, 6};
        // Call the function and print the minimum cost to connect the ropes
        int minCost = minCostToConnectRopes(ropes);
        System.out.println("Minimum cost to connect the ropes: " + minCost);
    }
}
