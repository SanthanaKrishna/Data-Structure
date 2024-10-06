package org.DSA.Recursion;

public class PrintNNaturalNumber {
    static void naturalNumber(int num) {
        if (num == 0) return;
        naturalNumber(num - 1);
        System.out.println(num + " ");
    }

    public static void main(String[] args) {
        naturalNumber(10);
        System.out.print("\n");
    }
}
