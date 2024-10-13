package org.DSA.Martix;

import java.util.Arrays;

/**
 * Given a 2D integer array A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
 * Input 1: A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]  Output 1: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * Input 2: A = [[1, 2],[1, 2],[1, 2]] Output 2: [[1, 1, 1], [2, 2, 2]]
 * Explanation 1:
 * Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 * Explanation 2: After transposing the matrix, A becomes [[1, 1, 1], [2, 2, 2]]
 */
public class MatrixTranspose {
    static int[][] TransposeMatrix(int[][] A) {
        int row = A.length, col = A[0].length;
        int[][] tranpose = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tranpose[j][i] = A[i][j];
            }
        }
        return tranpose;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = TransposeMatrix(arr);
        System.out.println(Arrays.deepToString(result));
    }
}
