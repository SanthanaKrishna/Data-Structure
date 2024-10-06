package org.DSA.Martix;

import java.util.Arrays;

public class AntiDiagnol {
    static int[][] antiDiagonal(int[][] arr) {
        int n = arr.length;
//        int rowLen = arr.length, colLen = arr[0].length;
//        int arraySize = colLen - rowLen - 1;
        int[][] result = new int[2 * n - 1][n];

        for (int col = 0; col < n; col++) {
            int startRow = 0, startCol = col, k = 0;
            int[] arr1 = new int[n];
            while (startCol >= 0 && startRow < n) {
                result[col][k++] = arr[startRow][startCol];
                startCol--;
                startRow++;
            }
        }


        for (int row = 0; row < n; row++) {
            int startRow = row, startCol = n - 1, k = 0;
            while (startRow < n && startCol >= 0) {
                result[row + n - 1][k++] = arr[startRow][startCol];
                startCol--;
                startRow++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int arr[][] = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20}
//        };
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = antiDiagonal(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
