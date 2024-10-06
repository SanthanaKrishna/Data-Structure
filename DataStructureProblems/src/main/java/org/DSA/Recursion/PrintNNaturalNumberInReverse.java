package org.DSA.Recursion;

public class PrintNNaturalNumberInReverse {
    static void naturalNumber(int num) {
        if (num == 0) return;
        System.out.println(num + " ");
        naturalNumber(num - 1);
    }

    public static void main(String[] args) {
        naturalNumber(9);
        System.out.print("\n");
    }
}
