package org.DSA.Sorting;

import java.util.Arrays;

/**
 * An integer is given to you in the form of an array, with each element being a separate digit.
 * Find the smallest number (leading zeroes are allowed) that can be formed by rearranging the digits of the given number in an array.
 * Return the smallest number in the form an array.
 * Note - Do not use any sorting algorithm or library's sort method.
 * Input 1:  A= [9 1 2 5 4 2 1 2 5 8]  Output 1:  [1 1 2 2 2 4 5 5 8 9]
 * Input 2:  A = [6, 3, 4, 2, 7, 2, 1]  Output 2: [1, 2, 2, 3, 4, 6, 7]
 * Input 3:  A = [4, 2, 7, 3, 9, 0]  Output 3: [0, 2, 3, 4, 7, 9]
 * Explanation 1: It can be proved that a rearrangement for 6342721 cannot be smaller than 1223467.
 * Explanation 2: Similarly, a rearrangement for 427390 cannot be smaller than 023479, i.e. 23479.
 * Time Complexity: N+Digits --> N+10 -> O(n)  Space Complexity: O(n)
 */
public class SmallestArray {
    static int[] sortSmallestArray(int[] arr) {
        final int Max = 10;
        int n = arr.length;
        int[] freqArr = new int[Max];
        for (int i = 0; i < n; i++) {
            freqArr[arr[i]]++;
        }
        System.out.println(Arrays.toString(freqArr)); //[0, 2, 3, 0, 1, 2, 0, 0, 1, 1]
        int k = 0;
        for (int i = 0; i < 10; i++) {  //freqArr always len=10
            for (int j = 1; j <= freqArr[i]; j++) {
                arr[k++] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {6, 3, 4, 2, 7, 2, 1};
        int[] result = sortSmallestArray(A);
        System.out.println(Arrays.toString(result));
    }
}
