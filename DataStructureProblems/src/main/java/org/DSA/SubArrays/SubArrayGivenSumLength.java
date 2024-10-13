package org.DSA.SubArrays;

/**
 * Given an array A of length N. Also given are integers B and C.
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 * Input 1: A = [4, 3, 2, 6, 1] B = 3 C = 11    Output 1: 1
 * Input 2: A = [4, 2, 2, 5, 1] B = 4 C = 6   Output 1: 0
 * Explanation 1: The subarray [3, 2, 6] is of length 3 and sum 11.
 * Explanation 2:   There are no such subarray.
 */
public class SubArrayGivenSumLength {
    static int sumArraySum(int[] A, int B, int C) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (i >= B) {
                sum -= A[i - B];
            }
            if (sum == C && i >= B - 1) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        int B = 3, C = 11;
        int result = sumArraySum(A, B, C);
        System.out.println(result);
    }
}
