package org.DSA.OneDimensional;

import java.util.Arrays;

/**
 * MinNumberOfSquares
 * Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.
 * Input 1:  A = 6    Output 1: 3
 * Input 2: A = 5  Output 2: 2
 * Explanation 1:
 * Possible combinations are : (12 + 12 + 12 + 12 + 12 + 12) and (12 + 12 + 22).
 * Minimum count of numbers, sum of whose squares is 6 is 3.
 * Explanation 2:  We can represent 5 using only 2 numbers i.e. 12 + 22 = 5
 * dp: dynamic programming
 */
public class MinNumberOfSquares {
    public static int countMinSquares(int n) { // Function to find the minimum number of perfect squares that sum up to n
        int[] dp = new int[n + 1];
        // simple base case assignment
        dp[0] = 0;
        dp[1] = 1;
        //finding optimal answer for every 2<=i<=N in bottom-up manner
        for (int i = 2; i <= n; i++) {
            //for i answer will be always less than equal to i.
            //maximum possible number of squares : i = (1^1+1^1+1^1+.....+1^1, i times)
            dp[i] = i;
            //Now identify from which number we have to make a direct jump to N so that the required answer is minimised.
            //do this by considering every possible direct jump
            //number of iterations will be <= sqrt(i)
            for (int x = 1; x * x <= i; x++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - x * x]);
            }
        }

        //here we get our optimal answer
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 13; // Example input: N
        System.out.println("Minimum number of perfect squares for sum " + n + " is: " + countMinSquares(n));
        System.out.println(countMinSquares(1));    // Output: 1
        System.out.println(countMinSquares(4));    // Output: 1
        System.out.println(countMinSquares(5));    // Output: 2
        System.out.println(countMinSquares(6));    // Output: 3
        System.out.println(countMinSquares(50));   // Output: 2
        System.out.println(countMinSquares(100));  // Output: 1
        System.out.println(countMinSquares(48));   // Output: 3
        System.out.println(countMinSquares(49));   // Output: 1
        System.out.println(countMinSquares(1000)); // Output: 2
        System.out.println(countMinSquares(100000)); // Large case
    }
}
