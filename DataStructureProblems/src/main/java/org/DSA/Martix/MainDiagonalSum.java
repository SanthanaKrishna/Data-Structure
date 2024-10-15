package org.DSA.Martix;

/**
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 * Input 1: 3 3 1 -2 -3 -4 5 -6 -7 -8 9  Output 1: 15
 * Input 2: 2 2 3 2 2 3 Output 2: 6
 * Explanation 1:
 * The size of matrix is 3.
 * So, considering the indexing from 0.
 * Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
 * A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
 * Explanation 2:
 * The size of matrix is 2.
 * So, considering the indexing from 0.
 * Main diagonal elements will be A[0][0] and A[1][1].
 * A[1][1] + A[2][2] = 3 + 3 = 6
 */
public class MainDiagonalSum {
    static int sumMainDiagonal(final int[][] arr) {
        int N = arr.length, sum = 0;
        for (int i = 0; i < N; i++) {
            // A[i][i] is the main diagonal element
            sum += arr[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        int result = sumMainDiagonal(arr);
        System.out.println(result); //15
    }
}

