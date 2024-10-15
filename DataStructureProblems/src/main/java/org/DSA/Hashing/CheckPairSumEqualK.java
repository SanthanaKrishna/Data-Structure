package org.DSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an Array of integers B, and a target sum A.
 * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 * Input 1:A = 8  B = [3, 5, 1, 2, 1, 2]   Output 1: 1
 * Input 2: A = 21 B = [9, 10, 7, 10, 9, 1, 5, 1, 5]  Output 2: 0
 * Example 1:
 * It is possible to obtain sum 8 using 3 and 5.
 * Example 2:
 * There is no such pair exists.
 */
public class CheckPairSumEqualK {

    static int checkPairSum(int[] arr, int K) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // formula b=k-a;
            int b = K - arr[i];
            if (set.contains(b)) {
                return 1;
            }
            set.add(arr[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        int A = 22;
//        int[] B = {3, 5, 1, 2, 1, 2};
        int[] B = {8,9,1,-2,4,5,11,-6,4,11};
        int result = checkPairSum(B, A);
        System.out.println(result);
    }
}
