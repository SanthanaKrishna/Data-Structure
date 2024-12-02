package org.DSA.Queues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * arr = {1, 2, 3}; k = 1;  Output: [1, 2, 3]
 *  arr = {1, 3, 2, 5}; k = 4;  Output: [5]
 */
public class SlidingWindowMaximum {
    // Method to find the maximum of each subArray of size k
    public static List<Integer> maxOfSubArrays(int[] arr, int K) {
        List<Integer> result = new ArrayList<>(); // To store the results
        Deque<Integer> deque = new LinkedList<>();// Deque to store indices of elements

        for (int i = 0; i < arr.length; i++) {
            int startIndex = i - K + 1;
            // Remove indices of elements that are outside the current window
            if (!deque.isEmpty() && deque.peekFirst() < startIndex) {
                deque.pollFirst();
            }

            // Remove indices of elements smaller than the current element from the back of the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add current index to the deque
            deque.offerLast(i);

            // Add the maximum for the current window to the result
            if (i >= K - 1) {// Start adding results only after the first window is fully formed
                if(!deque.isEmpty()){
                    result.add(arr[deque.peekFirst()]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 5, 5, 4, 5, 6};
        int k = 3;

        List<Integer> result = maxOfSubArrays(arr, k);
        System.out.println(result); // Output: [3, 4, 5, 5, 5, 5, 6]
    }
}