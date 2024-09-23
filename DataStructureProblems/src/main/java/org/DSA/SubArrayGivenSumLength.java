package org.DSA;

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
