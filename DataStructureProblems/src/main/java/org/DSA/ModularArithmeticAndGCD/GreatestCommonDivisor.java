package org.DSA.ModularArithmeticAndGCD;

/**
 * Greatest Common Divisor/ Highest Common Factor
 * Given 2 non-negative integers A and B, find gcd(A, B)
 * GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B.
 * Both A and B fit in a 32 bit signed integer.
 * Note: DO NOT USE LIBRARY FUNCTIONS.
 * Input 1: A = 4  B = 6  Output 1: 2
 * Input 2: A = 6  B = 7  Output 2: 1
 * Explanation 1: 2 divides both 4 and 6
 * Explanation 2: 1 divides both 6 and 7
 */
public class GreatestCommonDivisor {
    static int GCD(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        System.out.println(GCD(4, 6));  // Output: 2
        System.out.println(GCD(6, 7));
    }
}
