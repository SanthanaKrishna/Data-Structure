package org.DSA;

public class PrefixSumSpecialIndex {
    public int solve(int[] A) {
        int n = A.length;
        if (n == 1) return 1;
        if (n == 2) return 0;
        int[] pfEven = new int[n];
        int[] pfOdd = new int[n];
        pfEven[0] = A[0];
        pfOdd[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pfEven[i] = pfEven[i - 1] + A[i];
                pfOdd[i] = pfOdd[i - 1];
            } else {
                pfEven[i] = pfEven[i - 1];
                pfOdd[i] = pfOdd[i - 1] + A[i];
            }
        }

        int sumEven, sumOdd, result = 0;
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                sumEven = pfOdd[n - 1] - pfOdd[j];
                sumOdd = pfEven[n - 1] - pfEven[j];
            } else {
                sumEven = pfEven[j - 1] + (pfOdd[n - 1] - pfOdd[j]);
                sumOdd = pfOdd[j - 1] + (pfEven[n - 1] - pfEven[j]);
            }
            if (sumEven == sumOdd) result++;
        }
        return result;
    }
}
