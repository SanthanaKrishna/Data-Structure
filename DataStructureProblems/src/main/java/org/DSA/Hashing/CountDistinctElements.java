package org.DSA.Hashing;

import java.util.HashSet;

/**
 * Count distinct elements
 * Given an array A of N integers, return the number of unique elements in the array
 * Input 1: A = [3, 4, 3, 6, 6] Output 1: 3
 * Input 2: A = [3, 3, 3, 9, 0, 1, 0] Output 2: 4
 * Explanation 1: The distinct elements of the array are 3, 4 and 6.
 * Explanation 2: The distinct elements of the array are 3, 9, 0 and 1
 */
public class CountDistinctElements {

    static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
//        int[] A = {3, 5, 6, 5, 4};
        int[] A = {10, 9, 8};
        int result = countDistinct(A);
        System.out.println(result);
    }
}
