package org.DSA.Martix;

import java.util.Arrays;

/**
 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 * Example Input : [[1,2,3,4], [5,6,7,8], [9,2,3,4]]
 * Example Output: {15,10,13,16}
 * Example Explanation:
 * Column 1 = 1+5+9 = 15
 * Column 2 = 2+6+2 = 10
 * Column 3 = 3+7+3 = 13
 * Column 4 = 4+8+4 = 16
 */
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
