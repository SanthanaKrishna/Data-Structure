package org.DSA.Heaps;

import java.util.PriorityQueue;

public class ConnectingRopes {
    // Function to calculate the minimum cost of connecting the ropes
    public static int minCostToConnectRopes(int[] ropes) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Initialize a min-heap (priority queue) to store the rope lengths

        for (int rope : ropes) { // Add all ropes to the heap
            minHeap.offer(rope);
        }

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
        int[] ropes = {4, 3, 2, 6};

        // Call the function and print the minimum cost to connect the ropes
        int minCost = minCostToConnectRopes(ropes);
        System.out.println("Minimum cost to connect the ropes: " + minCost);
    }
}
