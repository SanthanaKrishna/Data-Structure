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
    static int PrefixSumArray(int[] arr, int K) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length, sum = 0;
        set.add(sum);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int b = sum - K;  // pf[i] - pf[i-1]=K --> a-b=k --> b=a-K
            if (set.contains(b)) {
                return b;
            }
            set.add(sum);
        }
//        if (set.size() < n) {
//            return 1;
//        }
        return 0;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int[] arr = {-2,16,-12,5,7,-1,2,12,11};
        int B = 17;
        int result = PrefixSumArray(arr, B);
        System.out.println(result);
    }
}
