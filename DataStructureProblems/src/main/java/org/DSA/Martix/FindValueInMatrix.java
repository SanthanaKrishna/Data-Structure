package org.DSA.Martix;

/**
 * Search in a row wise and column wise sorted matrix
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 * Input 1:- A = [[1, 2, 3], [4, 5, 6], [7, 8, 9]] B = 2  Output 1:- 1011
 * Input 2:- A = [[1, 2],[3, 3]]  B = 3   Output 2:- 2019
 */
public class FindValueInMatrix {

    static int searchRowColumnValue(int[][] arr, int K) {
        int value = 1009;
        int rowLen = arr.length, colLen = arr[0].length;
        int min = Integer.MAX_VALUE;
        int i = 0, j = colLen - 1;
        while (i < rowLen && j >= 0) {
            if (arr[i][j] == K) {
                int result = (i+1) * value + (j+1);
                min = Math.min(min, result);
                j--;
            }
            else if (arr[i][j] > K) {
                j--;
            } else {
                i++;
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }

    public static void main(String[] args) {
        int[][] arr= {{2,8,8}, {2,8,8},{2,8,8}};
        int b = 8;
        int result = searchRowColumnValue(arr, b);
        System.out.println(result);
    }
}
