package org.DSA;

/**
 * Find the Bth smallest element in given array A .
 * NOTE: Users should try to solve it in less than equal to B swaps.
 * Input 1: A = [2, 1, 4, 3, 2]  B = 3   Output 1: 2
 * Input 2: A = [1, 2]  B = 2   Output 2: 2
 * Explanation 1: 3rd element after sorting is 2.
 * Explanation 2: 2nd element after sorting is 2.
 */
public class KthSmallestElement {
    static int kthSmallest(final int[] A, int B) {
        int n = A.length, min = 0;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            int temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }
        return A[B - 1];
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2};
        int B = 3;
        int result = kthSmallest(A, -B);
        System.out.println(result);
    }
}
