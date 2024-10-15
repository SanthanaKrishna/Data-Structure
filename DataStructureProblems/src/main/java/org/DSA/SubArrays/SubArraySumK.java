package org.DSA.SubArrays;

import java.util.HashSet;

/**
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 * Input 1: A = [1, 2, 3, 4, 5] Output 1: 0
 * Input 2: A = [4, -1, 1] Output 2: 1
 * Explanation 1: No subarray has sum 0.
 * Explanation 2: The subarray [-1, 1] has sum 0
 */
public class SubArraySumK {
    static int PrefixSumArray(int[] arr) {
        HashSet<Long> set = new HashSet<>();
        int n = arr.length;
        long sum = 0;
        set.add(sum);  // Add 0 to the set to handle the case when subarray starting from index 0 sums to 0
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum)) {   // Check if the current prefix sum already exists in the set
                return 1;
            }
            set.add(sum);  // Add current prefix sum to the set
        }
//        if (set.size() < n) {
//            return 1;
//        }
        return 0;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int[] arr = {1, 2, 3, 4, 5};
        int result = PrefixSumArray(arr);
        System.out.println(result);
    }
}
