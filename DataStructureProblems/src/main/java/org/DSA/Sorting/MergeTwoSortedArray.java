package org.DSA.Sorting;

import java.util.Arrays;

/**
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 * Note: A linear time complexity is expected and you should avoid use of any library function.
 * Input 1: A = [4, 7, 9] B = [2, 11, 19]   Output 1:  [2, 4, 7, 9, 11, 19]
 * Input 2:  A = [1]  B = [2]    Output 2: [1, 2]
 * Explanation:  Merging A and B produces the output as described above.
 * Time Complexity: O(n+m)  Space Complexity: O(n+m)
 */
public class MergeTwoSortedArray {
    static int[] mergeArraySort(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[] sortArr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                sortArr[k] = A[i];
                i++;
            } else {
                sortArr[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            sortArr[k] = A[i];
            i++;
            k++;
        }
        while (j < m) {
            sortArr[k] = B[j];
            j++;
            k++;
        }
        return sortArr;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 7, 8, 12}, B = {3, 5, 6, 7};
        int[] result= mergeArraySort(A,B);
        System.out.println(Arrays.toString(result));
    }
}
