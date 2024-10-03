package org.DSA.SubArrays;
import java.util.Arrays;

/** Carry Forward & SubArrays - Subarray in given range
 * Given an array A of length N, return the subarray from B to C.
 * Input 1: A = [4, 3, 2, 6] B = 1 C = 3  Output 1: [3, 2, 6]
 * Input 2: A = [4, 2, 2] B = 0 C = 1  Output 2: [4, 2]
 * Explanation 1: The subarray of A from 1 to 3 is [3, 2, 6].
 * Explanation 2: The subarray of A from 0 to 1 is [4, 2].
 */
public class SubArrayGivenRange {
    static int[] solve(int[] A, int B, int C) {
        int[] result = new int[C - B + 1];
        int index=0;
        for (int i = B; i <= C; i++) {
            result[index] = A[i];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 3, 6, 7, 8, 7, 3, 7};
        int B = 1;
        int C = 2;
        int[] result = solve(arr, B, C);
        System.out.println(Arrays.toString(result));
    }
}
