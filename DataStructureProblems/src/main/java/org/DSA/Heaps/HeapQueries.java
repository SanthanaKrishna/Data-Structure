package org.DSA.Heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapQueries {
    public static ArrayList<Integer> processHeapQueries(int[][] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int[] query : arr) {
            int P = query[0];
            int Q = query[1];

            if (P == 2) {
                minHeap.offer(Q); // Insert Q into the heap
            } else if (P == 1) {
                if (minHeap.isEmpty()) { // Extract Min from the heap
                    result.add(-1); // If heap is empty, return -1
                } else {
                    result.add(minHeap.poll());// Extract the minimum element
                }
            }
        }

        // Convert ArrayList to int[]
//        int[] output = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            output[i] = result.get(i);
//        }
//        return output;

        return result;
    }

    public static void main(String[] args) {
        int[][] A1 = {{1, -1}, {2, 2}, {2, 1}, {1, -1}};
        int[][] A2 = {{2, 5}, {2, 3}, {2, 1}, {1, -1}, {1, -1}};

        System.out.println(processHeapQueries(A1)); // Output: [-1, 1]
        System.out.println(processHeapQueries(A2)); // Output: [1, 3]
    }
}
