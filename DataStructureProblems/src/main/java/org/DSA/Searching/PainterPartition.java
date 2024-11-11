package org.DSA.Searching;

/**
 * Painter's Partition Problem
 * Given 2 integers A and B and an array of integers C of size N.
 * Element C[i] represents the length of ith board.
 * You have to paint all N boards [C0, C1, C2, C3 … CN-1].
 * There are A painters available and each of them takes B units of time to paint 1 unit of the board.
 * Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
 * NOTE:
 * 1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
 * 2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.
 * Return the ans % 10000003
 * Input 1:  A = 2  B = 5 C = [1, 10]    Output 1: 50
 * Input 2:  A = 10  B = 1 C = [1, 8, 11, 3]   Output 2: 11
 * Explanation 1:
 * Possibility 1:- One painter paints both blocks, time taken = 55 units.
 * Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
 * There are no other distinct ways to paint boards.
 * ans = 50 % 10000003
 * Explanation 2:
 * Each block is painted by a painter so, Painter 1 paints block 1, painter 2 paints block 2, painter 3 paints block 3
 * and painter 4 paints
 */
public class PainterPartition {
    static boolean canPaintWithinTime(int[] arr, int A, long mid, int B) {
        int painters = 1; // Start with one painter
        long total = 0;  // Total time taken by the current painter
        for (int i = 0; i < arr.length; i++) {
            long timeToPaintBoard = (long) i * B;

            if (timeToPaintBoard > mid) {  // If a single board's time is greater than maxTime, it's impossible to paint within maxTime
                return false;
            }
            if (total + timeToPaintBoard > mid) {  // If adding the current board exceeds maxTime, assign a new painter
                painters++;
                total = timeToPaintBoard;  // Start counting time for the new painter

                if (painters > A) {  // If the required painters exceed A, return false
                    return false;
                }
            } else {
                total += timeToPaintBoard;  // Otherwise, add the time for the current board to total
            }
        }
        return true;
    }

    static int paint(int A, int B, int[] arr) {
        long left = 0, right = 0;
// Calculate the range for binary search (min and max time)
        for (int i = 0; i < arr.length; i++) {
            right += (long) arr[i] * B;  // Sum of all board times if a single painter paints everything
            left = Math.max(left, (long) arr[i] * B);  // Minimum time is the largest single board time
        }

        long result = right;   // Initialize the result with the upper bound

        // Binary search on the time
        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (canPaintWithinTime(arr, A, mid, B)) {
                result = mid; // store this feasible `mid` as a possible answer
                right = mid - 1;  // Try for a smaller maximum time
            } else {
                left = mid + 1;  // Increase the time limit and try again
            }
        }
        return (int) (result % 10000003);
    }

    public static void main(String[] args) {
        int A = 5, B = 2;
        int[] C = {5, 8, 12, 3, 6, 7};
        int result = paint(A, B, C);
        System.out.println(result);
    }
}
