package org.DSA.Recursion;

public class Factorial {

    static int factorialNum(int num) {
        if (num == 0) return 1;
        return num * factorialNum(num - 1);
    }

    public static void main(String[] args) {
        int result = factorialNum(1);
        System.out.println(result);
    }
}
