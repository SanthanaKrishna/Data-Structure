package org.DSA.Hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * You are given an array A of N integers and an integer B.
 * Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
 * Since the answer can be very large, return the remainder after dividing the count with 109+7.
 * Input 1: A = [3, 5, 1, 2] B = 4  Output 1: 1
 * Input 2: A = [1, 2, 1, 2] B = 1 Output 2: 4
 * Example 1: The only pair is (2, 3) which gives difference as 4
 * Example 2: The pair which gives difference as 3 are (2, 1), (4, 1), (2, 3) and (4, 3).
 */
public class CountPairDifference {
    static int solve(int[] A, int B) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        final int mod = (int)(1e9 + 7);
        long ans = 0;
        for(int i = 0 ; i < A.length ; i++){
            ans += freq.getOrDefault(A[i] - B, 0) + freq.getOrDefault(A[i] + B, 0);
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        return (int)(ans % mod);
    }
    public static void main(String[] args) {
//        int[] A={3, 5, 1, 2};
//        int B = 4;
        int[] A={1, 2, 1, 2};
        int B = 1;
        int result = solve(A, B);
        System.out.println(result);
    }
}
