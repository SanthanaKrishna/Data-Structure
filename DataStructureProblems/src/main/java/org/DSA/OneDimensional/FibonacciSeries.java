package org.DSA.OneDimensional;

public class FibonacciSeries {
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(second + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacciSeries(n);

        printFibonacciSeries(6);
    }
}
