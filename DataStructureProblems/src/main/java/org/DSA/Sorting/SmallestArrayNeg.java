package org.DSA.Sorting;

import java.util.Arrays;

/**
 * this problem is to handle negative number of the smallestArray problem
 */
public class SmallestArrayNeg {
    static int[] sortSmallestArray(int[] arr) {
        int n = arr.length;
        //find min max value
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }

        //create  frequency array
        int range = max - min + 1;
        int[] freqArr = new int[range];
        for (int i = 0; i < n; i++) {
            int index = arr[i] - min; // -2-(-2) --> 0
            freqArr[index]++;
        }
        int k = 0;
        for (int i = 0; i < range; i++) {
            int ele = i + min;  //-2 <-- 0 +(-2)
            int count = freqArr[i];
            for (int j = 1; j <= count; j++) {
                arr[k] = ele;
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {-2, 3, 8, 3, -2, 3}; //output: [-2, -2, 3, 3, 3, 8]
        int[] result = sortSmallestArray(A);
        System.out.println(Arrays.toString(result));
    }
}
