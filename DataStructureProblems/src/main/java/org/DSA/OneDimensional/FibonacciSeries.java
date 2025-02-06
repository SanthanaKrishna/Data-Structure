package org.DSA.OneDimensional;

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int first = 0, second = 1, next = 0;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 2; i <= n; i++) {
            System.out.print(second + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printFibonacciSeries(num);
    }
}
