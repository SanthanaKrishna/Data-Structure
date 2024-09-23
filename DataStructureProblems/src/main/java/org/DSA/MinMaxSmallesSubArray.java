package org.DSA;

public class MinMaxSmallesSubArray {

    static int [] minMax(int[] arr, int n) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {814,761,697,483,981};
        int n= arr.length;
        int[] result = minMax(arr, n);
        int min = result[0], max = result[1];
        System.out.println(min);
        System.out.println(max);
        int min_index = -1, max_index = -1, smallestSubArray = n;
        for (int i = 0; i < n; i++) {
            if (min == arr[i]) {
                min_index = i;
                if (max_index != -1) {
                    int currentSubArray = min_index - max_index + 1;
                    if (currentSubArray < smallestSubArray) {
                        smallestSubArray = currentSubArray;
                    }
                }
            } else if (max == arr[i]) {
                max_index = i;
                if (min_index != -1) {
                    int currentSubArray = max_index - min_index + 1;
                    if (currentSubArray < smallestSubArray) {
                        smallestSubArray = currentSubArray;
                    }
                }
            }
        }
        System.out.println(smallestSubArray);
    }
}

//class MinMaxPair {
//    int min;
//    int max;
//
//    MinMaxPair(int min, int max) {
//        this.min = min;
//        this.max = max;
//    }
//}

