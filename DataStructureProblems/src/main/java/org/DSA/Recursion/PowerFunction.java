package org.DSA.Recursion;

/**
 * For pow function: Time complexity : O(n) Space Complexity : 0(n)
 * For powOddEven Function: Time complexity will be GP Space Complexity : 0(n) and Space complexity O(log2 N)
 * For fastPowerMethod Function: Time complexity : 0(log2 N) and Space complexity O(log2 N)
 */
public class PowerFunction {
    //Idea 1:
    static int pow(int a, int n) {
        if (n == 0) return 1;
        return a * pow(a, (n - 1));
    }
    //Idea 2: odd and even power

    /**
     * if n == even, then pow(a, n/2)*pow(a, n/2)
     * if n == odd, then pow(a, n/2)*pow(a, n/2)*a
     */
    static int powOddEven(int a, int n) {
        if (n == 0) return 1;
        if ((n & 1) == 0) { //write if(n%2 ==0) as well
            return powOddEven(a, n / 2) * powOddEven(a, n / 2);
        } else { //write if((n & 1) == 1) is for odd
            return powOddEven(a, n / 2) * powOddEven(a, n / 2) * a;
        }
    }

    //Optimised Approach from the above methods
    static int fastPowerMethod(int a, int n) {
        if (n == 0) return 1;
        int value = fastPowerMethod(a, n / 2);
        value = value * value;
        if ((n & 1) == 0) {
            return value;
        } else {
            return value * a;
        }
    }

    public static void main(String[] args) {
        int result = pow(5, 3);
        int resultOddEvenPow = powOddEven(2, 10);
        int resultFastPowerMethod = fastPowerMethod(2, 5);
        System.out.println(result);
        System.out.println(resultOddEvenPow);
        System.out.println(resultFastPowerMethod);
    }
}
