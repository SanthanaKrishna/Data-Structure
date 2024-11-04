package org.DSA.Searching;

/**
 * Square Root of Integer
 * Given an integer A. Compute and return the square root of A.
 * If A is not a perfect square, return floor(sqrt(A)).
 * NOTE:
 * The value of A*A can cross the range of Integer.
 * Do not use the sqrt function from the standard library.
 * Users are expected to solve this in O(log(A)) time.
 * Input 1: 11   Output 1: 3
 * Input 2: 9   Output 2:  3
 * Explanation 1: When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 * Explanatino 2: When A = 9 which is a perfect square of 3, so we return 3
 */
public class FindFloorSqrtN {

    static int sqrtNBinarySearch(int N) {
        if (N == 0 || N == 1) return N;
        int left = 0, right = N, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid*mid;
            if(midSquared == N) return N;
            if (midSquared <= N) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 29;
        int result = sqrtNBinarySearch(N);
        System.out.println(result);
        System.out.println(sqrtNBinarySearch(2147483647));
    }
}
