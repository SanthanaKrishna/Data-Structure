package org.DSA.OneDimensional;

/**
 * Stairs
 * You are climbing a staircase and it takes A steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Return the number of distinct ways modulo 1000000007
 * Input 1:  A = 2  Output 1: 2
 * Input 2:  A = 3   Output 2:  3
 * Explanation 1: Distinct ways to reach top: [1, 1], [2].
 * Explanation 2: Distinct ways to reach top: [1 1 1], [1 2], [2 1].
 * To solve this problem, you can use dynamic programming.
 * Since the number of ways to climb stairs is similar to the Fibonacci sequence, the number of ways to reach the nth step is the sum of the ways to reach the (n-1)th and (n-2)th steps.
 * We are given that the number of steps can be as large as 10^5, so we need to use a modulo operation (% 1000000007) to avoid integer overflow and ensure that the result fits within standard integer limits.
 */
public class ClimbingStairs {
    public static int countWays(int n) {
        // Modulo value as given in the problem statement
        int MOD = 1000000007;
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1]; // Create a DP array to store the number of ways to reach each stair

        dp[1] = 1;  // 1 way to reach the first step
        dp[2] = 2; // 2 ways to reach the second step
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 55007; // Example input: Nth stair
        System.out.println("Number of ways to reach the " + n + "th stair: " + countWays(n));
    }
}

/**
 * if dp[100000], the values would become huge and might cause overflow.
 * Why Modulo 1000000007:
 * It’s a large prime number, which is useful for avoiding collisions in hash functions and minimizing the chance of repeated results when using modular arithmetic.
 * It helps in keeping the results within a range that a typical int can handle without causing overflow.
 * Without the modulo operation, if we go up to A=100000, these numbers will become huge. Using the modulo, we ensure we do not overflow the integer limits.
 */
