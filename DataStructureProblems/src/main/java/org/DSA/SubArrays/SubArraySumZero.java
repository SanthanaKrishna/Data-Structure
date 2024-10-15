package org.DSA.SubArrays;

import java.util.HashSet;

/**
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 * Input 1: A = [1, 2, 3, 4, 5] Output 1: 0
 * Input 2: A = [4, -1, 1] Output 2: 1
 */
public class SubArraySumZero {
    static int PrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pf = new int[arr.length];
        HashSet<Integer> set = null;
        pf[0] = arr[0];
        if (pf[0] == 0) return 1;
        set.add(pf[0]);
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
            if (pf[i] == 0) {
                return 1;
            }
            set.add(pf[i]);
        }
        if (set.size() < n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, -3, 4, 3, 1, -2, -3, 2};
        int result = PrefixSumArray(arr);
        System.out.println(result);
    }
}
