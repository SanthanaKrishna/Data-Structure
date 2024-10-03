package org.DSA.PrefixSum;

/** Special Index
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices
 * makes the sum of even-indexed and odd-indexed array elements equal.
 * Input 1: A = [2, 1, 6, 4]  Output 1: 1
 * Input 2: A = [1, 1, 1] Output 2: 3
 * Explanation 1:
 *  Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
 *  Therefore, the required output is 1.
 * Explanation 2:
 *  Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 *  Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 *  Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 *  Therefore, the required output is 3.
 */
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
