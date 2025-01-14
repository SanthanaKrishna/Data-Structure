package org.DSA.OneDimensional;

public class ClimbingStairs {
    public static int countWays(int n) {
        if (n == 0 || n == 1) return 1;

        int[] dp = new int[n + 1]; // Create a DP array to store the number of ways to reach each stair

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; // Example input: Nth stair
        System.out.println("Number of ways to reach the " + n + "th stair: " + countWays(n));
    }
}
