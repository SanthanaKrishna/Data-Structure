package org.DSA.Sorting;

import java.util.Arrays;

/**
 * Given an integer array, consider first elements as pivot, rearrange the elements such that for all i :
 * If A[i] <= p then it should be present on left side.
 * If A[i] > p then it should be present on right side.
 */
public class PivotPartitionFirstIndex {

    static int[] sortUsingPivot(int[] arr) {
        int n = arr.length;
        int low = 1, high = n - 1, pivot = arr[0];
        while (low <= high) {
            if (arr[low] <= pivot) {
                low++;
            } else if (arr[high] > pivot) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
//        int temp=
        return new int[]{1, 2};
    }

    public static void main(String[] args) {
        int[] A = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        int[] result = sortUsingPivot(A);
        System.out.println(Arrays.toString(result));
    }
}
