package org.DSA;

/**
 * Given an array A of size N.
 * You need to find the sum of Maximum and Minimum element in the given array.
 * Input 1: A = [-2, 1, -4, 5, 3] Output 1: 1
 * Input 2: A = [1, 3, 4, 1] Output 2: 5
 */
public class MinMaxSumArray {
    static int sumMinMax(int[] A) {
        int min = A[0], max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        return max + min;
    }

    public static void main(String[] args) {
        int[] A = {-2, 1, -4, 5, 3}; // (5 + (-4)) = 1.
        int result = sumMinMax(A);
        System.out.println(result);
    }
}
