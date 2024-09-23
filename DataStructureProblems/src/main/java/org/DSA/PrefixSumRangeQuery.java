package org.DSA;

import java.util.Arrays;

public class PrefixSumRangeQuery {
    static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        long[] pfSumArr = new long[n];
        pfSumArr[0] = A[0];
        for (int i = 1; i < n; i++) {
            pfSumArr[i] = pfSumArr[i - 1] + A[i]; // Sum from the 0th to the i-th index
        }
        System.out.println(Arrays.toString(pfSumArr));

        int q = B.length;
        long sum = 0;
        long[] result = new long[q];
        for (int j = 0; j < q; j++) {
            int L = B[j][0], R = B[j][1];
            if (L == 0) {
                sum = pfSumArr[R];
            } else {
                sum = pfSumArr[R] - pfSumArr[L - 1];
            }
            result[j] = sum;
        }
//        for (int j = 0; j < q; j++) {
//            result[i] = pfSumArr[B[j][1]] - (B[j][0] > 0 ? pfSumArr[B[i][0] - 1] : 0);
//        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 9, 4, 1, 8, 3};
//        int[][] query = {{1, 3}, {6, 7}, {0, 3}, {0, 5}, {7, 7}, {1, 1}, {3, 7}, {1, 3}, {6, 7}, {5, 6}};
        int[] arr = {1, 2, 3, 4, 5};
        int[][] query = {{0, 3}, {1, 2}};
        long[] result = rangeSum(arr, query);
        System.out.println(Arrays.toString(result));
    }
}
