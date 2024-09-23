package org.DSA;

import java.util.Arrays;

public class GenerateAllSubArray {
    static int[][] allSubArray(int[] arr) {
        int n = arr.length;
        int totalSubArray = n * (n + 1) / 2;
        int[][] result = new int[totalSubArray][];
        System.out.println(Arrays.toString(result));
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySize = j - i + 1;
                result[index] = new int[subArraySize];
                for (int k = 0; k < subArraySize; k++) {
                    result[index][k] = arr[i + k];
                }
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[][] subArrays = allSubArray(arr);
//        int[]subArrays = allSubArray(arr);
        System.out.println(Arrays.deepToString(subArrays));
    }
}
