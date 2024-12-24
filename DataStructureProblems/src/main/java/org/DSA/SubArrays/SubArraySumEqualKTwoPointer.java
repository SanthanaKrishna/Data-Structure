package org.DSA.SubArrays;

import java.util.Arrays;

/**
 * SubArray with Sum Equals to K  - using two pointer approach or Sliding Window Approach both are same here
 * Given an array of positive integer A and B, Find and return first continuous subarray which adds to B.
 * IF the answer does not exist return an array with single integer '-1'.
 * First Sub-Array means the sub-array for which starting index in minimum.
 */
public class SubArraySumEqualKTwoPointer {
    public static int[] findSubArrayWithSum(int[] arr, int K) {
        int i = 0, j = 0, sum = 0, n = arr.length;

        while (j < arr.length) {// Use the two-pointer approach
            sum += arr[j];// Add the current element to the sum
            while (sum > K && i <= j) {// While the sum exceeds K, shrink the window from the left
                sum -= arr[i];
                i++;
            }

            if (sum == K) {// Check if the current sum equals K
                return new int[]{i, j}; // Return start and end indices
            }

            j++;// Expand the window
        }

        return new int[]{-1, -1};// If no subarray with the desired sum is found, return [-1, -1]
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 15, 10, 20, 3, 23, 33, 43};
        int K = 33;

        // Find and display the result
        int[] result = findSubArrayWithSum(arr, K);
        System.out.println("SubArray with sum " + K + ": " + Arrays.toString(result));
    }
}
