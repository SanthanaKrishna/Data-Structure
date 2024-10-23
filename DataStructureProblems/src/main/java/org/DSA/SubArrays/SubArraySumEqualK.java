package org.DSA.SubArrays;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers A and an integer B.
 * Find the total number of subarrays having sum equals to B.
 * Input 1:  A = [1, 0, 1]  B = 1   Output 1: 4
 * Input 2: A = [0, 0, 0] B = 0   Output 2: 6
 * Explanation 1: [1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
 * Explanation 1: All the possible subarrays having sum 0.
 */
public class SubArraySumEqualK {
    static int countSubArraysWithSumK(int[] arr, int K) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, count = 0;
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - K)) {
                count += hm.get(sum - K);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-20, -13, 4, 2, 18, -17, 17};
        int B = 11;
        int result = countSubArraysWithSumK(arr, B);
        System.out.println(result); // Output should be 2 for this case
    }
}
