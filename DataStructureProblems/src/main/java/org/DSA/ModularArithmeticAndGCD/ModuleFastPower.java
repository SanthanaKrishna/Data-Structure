package org.DSA.ModularArithmeticAndGCD;

/**
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 * Note: The remainders on division cannot be negative.
 * In other words, make sure the answer you return is non-negative.
 * Input 1: A = 2 B = 3 C = 3  Output 1: 2
 * Input 2: A = 3 B = 3 C = 1 Output 2: 0
 * Explanation 1: 2^3 % 3 = 8 % 3 = 2
 * Explanation 1: 3^3 % 1 = 27 % 1 = 0
 */
public class ModuleFastPower {
    static int powerFunction(int a, int n, int m) {
        if (a == 0) return 0;
        // Converting a to positive equivalent if it is negative
        if (n == 0) return 1;
        long p = powerFunction(a, n / 2, m);
        p = (p * p) % m;
        if (n % 2 == 1){
            p = p * a;
        }
        p = (p + m) % m;
        return (int) p;
    }

    public static void main(String[] args) {
        int A = -1, B = 1, C = 20;
//        int A = 0, B = 0, C = 1; //0
        int result = powerFunction(A, B, C);
        System.out.println(result);
    }
}
