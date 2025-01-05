package org.DSA.Heaps;

import java.util.Arrays;

/**
 *  ### Build a Heap
 *  Given an array A of N integers, convert that array into a min heap and return the array.
 * NOTE: A min heap is a binary tree where every node has a value less than or equal to its children.
 * **Input 1:** `A = [5, 13, -2, 11, 27, 31, 0, 19]` &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; **Output 1:** `A = [-2, 5, 0, 13, 11, 19, 27, 31]
 * One possible Heap is
 *                 -2
 *                /    \
 *              5       0
 *             / \    /  \
 *           13  11  19   27
 *           /
 *         31
 * It can be seen that each parent has a value smaller than its children. Hence it is a Valid Heap.
 * The Heap in the Array format is [-2, 5, 0, 13, 11, 19, 27, 31].
 * Some more possible heaps are  [-2, 0, 5, 13, 11, 27, 19, 31], [-2, 5, 0, 11, 27, 13, 19, 31], etc.
 * You can return any possible Valid Heap Structure.
 */

public class BuildHeap {
    public static int[] minBuildHeap(int[] arr) {
        int n = arr.length;
        // Start from the last non-leaf node and heapify down to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        return arr;
    }

    private static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1; // left child index
        int right = 2 * i + 2; // right child index

        // Check if left child exists and is smaller than the current smallest
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        // Check if right child exists and is smaller than the current smallest
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        // If the smallest is not the current element, swap and continue heapifying
        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, -2, 11, 27, 31, 0, 19};
        int[] result = minBuildHeap(arr);
        System.out.println(Arrays.toString(result));
    }
}
