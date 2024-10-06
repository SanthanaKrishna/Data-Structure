package org.DSA;

import java.util.Arrays;

/**
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 * Input 1: A = [1, 2, 3, 4] B = 2  Output 1: [3, 4, 1, 2]
 * Input 2: A = [2, 5, 6] B = 1  Output 2: [6, 2, 5]
 */
public class RotateArrayKTimes {
    static void arrayReverse(int[] Arr, int start, int end) {
        int i = start, j = end;
        while (i < j) {
            int temp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(Arr));
    }

    public static int[] rotateArray(int[] arr, int B) {
        int n = arr.length;
        int k = B % n;
        arrayReverse(arr, 0, n - 1);
        arrayReverse(arr, 0, k - 1);
        arrayReverse(arr, k, n - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int[] result = rotateArray(A, B);
        System.out.println(Arrays.toString(result));
    }
}
