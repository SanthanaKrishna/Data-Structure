package org.DSA;

import java.util.Arrays;

/**
 * Given an array A of N integers and also given two integers B and C.
 * Reverse the elements of the array A within the given inclusive range [B, C].
 * Input 1: A = [1, 2, 3, 4] B = 2 C = 3  Output 1: [1, 2, 4, 3]
 * Input 2: A = [2, 5, 6] B = 0 C = 2 Output 2: [6, 5, 2]
 */
public class ReverseArrayInRange {
    static int[] reverseArray(int[] A, int B, int C) {
        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2, C = 3;
        int[] result = reverseArray(A, B, C);
        System.out.println(Arrays.toString(result));
    }
}
