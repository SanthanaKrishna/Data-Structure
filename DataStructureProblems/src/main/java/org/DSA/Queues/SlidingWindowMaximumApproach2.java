package org.DSA.Queues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * arr = {1, 2, 3}; k = 1;  Output: [1, 2, 3]
 * arr = {1, 3, 2, 5}; k = 4;  Output: [5]
 */
public class SlidingWindowMaximumApproach2 {
    // Method to find the maximum of each subArray of size k
    public static List<Integer> maxOfSubArrays(int[] arr, int K) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int start = 0;

        // Process the first window of size K
        for (int i = 0; i < K; i++) {
            // Remove elements smaller than the current element from the deque
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
            // Add the current index to the deque
            dq.offerLast(i);
        }

        // Add the maximum of the first window
        result.add(arr[dq.peekFirst()]);

        // Start sliding the window
        start++;
        int i = 1, j = K;
        while (j < arr.length) {
            // Remove elements smaller than the current element from the deque
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[j]) {
                dq.pollLast();
            }
            // Add the current index to the deque
            dq.offerLast(j);

            // Remove the elements outside the current window
            if (start > dq.peekFirst()) {
                dq.pollFirst();
            }

            // Add the maximum of the current window
            result.add(arr[dq.peekFirst()]);

            // Move the window forward
            start++;
            i++;
            j++;
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