package org.DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    static void mergeTwoArray(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; //[l mid]
        int n2 = right - mid; //[mid+1 r] --> r-(mid+1)+1 --> r-mid-1+1
        int[] P = new int[n1];
        int[] Q = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            int index = left + i;
//            P[i] = arr[index];
//        }
//        for (int j = 0; j < n2; j++) {
//            int index = mid + 1 + j;
//            Q[j] = arr[index];
//        }

        int x = 0;
        for (int i = left; i <= mid; i++) {
            P[x] = arr[i];
            x++;
        }
        int y = 0;
        for (int j = mid + 1; j <= right; j++) {
            Q[y] = arr[j];
            y++;
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (P[i] <= Q[j]) {
                arr[k] = P[i];
                i++;
            } else {
                arr[k] = Q[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = P[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Q[j];
            j++;
            k++;
        }
    }

    static int[] recursionMergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            recursionMergeSort(arr, left, mid);
            recursionMergeSort(arr, mid + 1, right);
            mergeTwoArray(arr, left, mid, right);
        }
        return arr;
    }

    public static void main(String[] args) {
//        int[] A = {3, 10, 6, 8, 15, 2, 12, 18, 17};
        int[] A = {1, 4, 10, 2, 1, 5};
        int[] result = recursionMergeSort(A, 0, A.length - 1);
        System.out.println(Arrays.toString(result));
    }
}
