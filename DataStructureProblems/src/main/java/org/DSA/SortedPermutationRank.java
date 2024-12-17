package org.DSA;

public class SortedPermutationRank {

    private static long factorial(int n) {
        if (n <= 1) return 1;// Base case: 0! and 1! are both 1
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;// Multiply to compute factorial
        }
        return fact;
    }

    // Function to calculate the lexicographical rank of the string
    public static int findRank(String A) {
        int n = A.length();
        long rank = 1;// Rank starts at 1
        long mod = 1000003;// To handle large numbers and prevent overflow

        long[] fact = new long[n + 1];// Array to store factorial values
        fact[0] = 1; // 0! = 1
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % mod; // Compute factorial using modular arithmetic
        }

        for (int i = 0; i < n; i++) {
            int smallestCount = 0;
            for (int j = i + 1; j < n; j++) {// Count characters smaller than A[i] to the right
                if (A.charAt(j) < A.charAt(i)) {
                    smallestCount++;
                }
            }
            int factNum = n - i - 1;
            rank = (rank + (smallestCount * fact[factNum]) % mod) % mod;
        }
        return (int) rank;
    }

    public static void main(String[] args) {
        String A = "BAC";
        int rank = findRank(A);
        System.out.println("The rank of the string \"" + A + "\" is: " + rank);
    }
}
