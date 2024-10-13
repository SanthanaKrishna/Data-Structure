package org.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.
 * Input 1: A = [3, 2, 1, 3] Output 1: 1
 * Input 2: A = [1, 1, 3, 3]  Output 1: -1
 * Explanation 1: For integer 2, there are 2 greater elements in the array.
 * Explanation 2: There exist no integer satisfying the required conditions.
 */
public class NobleInteger {

    static int solve1(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        for (int i = 0; i < size; i++) {
            while (i + 1 < size && A.get(i) == A.get(i + 1))
                i++;
            if (A.get(i) == size - 1 - i)
                return 1;
        }
        return -1;
    }

    static int countNobleInteger(int[] A) {
        Arrays.sort(A);
        int n = A.length, less = 0, count = 0;
        if (A[0] == 0) count++;
        for (int i = 1; i < n; i++) {
            if (A[i] != A[i - 1]) {
                less = i;
            }
            if (A[i] == less) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        int result = countNobleInteger(A);
        System.out.println(result);
    }
}
