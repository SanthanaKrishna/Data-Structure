package org.DSA.Recursion;

public class PrintArrayUsingRecursion {
    static void printArray(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index]+ " ");
        printArray(arr, index + 1);
    }

    static void printArrayReverse(int[] arr, int n) {
        if (n < 0) return;
        System.out.println(arr[n]);
        printArrayReverse(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        printArray(arr, 0);
//        printArrayReverse(arr, n - 1);
    }
}
