package org.example;

import java.util.Arrays;

public class ColumnSum2DArray {
    static int[] sumArray(int[][] A) {
        int col = A.length, row = A[0].length, sum = 0;
        int[] sumArray = new int[row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += A[j][i];
            }
            sumArray[i] = sum;
            sum = 0;
        }
        return sumArray;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int[] result = sumArray(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
