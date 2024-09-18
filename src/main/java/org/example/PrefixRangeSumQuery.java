package org.example;

import java.util.Arrays;

public class PrefixRangeSumQuery {
    static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        int[] pfArr = new int[n];
        pfArr[0] = A[0];
        for (int i = 1; i < n; i++) {
            pfArr[i] = pfArr[i - 1] + A[i];
        }
        System.out.println(Arrays.toString(pfArr));

        int q = B.length;
        int sum;
        long[] result = new long[q];
        for (int j = 0; j < q; j++) {
            int L = B[j][0], R = B[j][1];
            if (L == 0) {
                sum = pfArr[R];
            } else {
                sum = pfArr[R] - pfArr[L - 1];
            }
            result[j] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 9, 4, 1, 8, 3};
        int[][] query = {{1, 3}, {6, 7}, {0, 3}, {0, 5}, {7, 7}, {1, 1}, {3, 7}, {1, 3}, {6, 7}, {5, 6}};
        long[] result = rangeSum(arr, query);
        System.out.println(Arrays.toString(result));
    }
}
