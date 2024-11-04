package org.DSA.Searching;

/**
 * Given a sorted array of integers A of size N and an integer B,
 * where array A is rotated at some pivot unknown beforehand.
 * For example, the array [0, 1, 2, 4, 5, 6, 7] might become [4, 5, 6, 7, 0, 1, 2].
 * Your task is to search for the target value B in the array. If found, return its index; otherwise, return -1.
 * You can assume that no duplicates exist in the array.
 * NOTE: You are expected to solve this problem with a time complexity of O(log(N))
 * Search an element in sorted and rotated array. [ Distinct ]
 * Input 1:  [10, 20, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9]  K=20      Output 1: 1
 * Input 2:  [70, 80, 90, 100, 40, 50, 60]  K=60    Output 1:  6
 * Input 3: A = [4, 5, 6, 7, 0, 1, 2, 3] B = 4      Output 1:  0
 * Input 4: A : [ 9, 10, 3, 5, 6, 8 ] B : 5     Output 2: 3
 * Explanation 3: Target 4 is found at index 0 in A.
 * Explanation 4: Target 5 is found at index 3 in A.
 * Time Complexity: O(log(N)) because binary search is used.
 * Space Complexity: O(1) as only constant space is required.
 */
public class RotateArraySortedSearchK {
    static int rotateSearchK(int[] arr, int K) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == K) return mid;

            // Check if left part is sorted
            if (arr[left] < arr[mid]) {
                if (K >= arr[left] && K <= arr[mid]) { // Check if target is in the sorted left part
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // the right part must be sorted
                if (K >= arr[mid] && K <= arr[right]) { // Check if target is in the sorted right part
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {10, 20, 30, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int K = 20;
        int result = rotateSearchK(A, K);
        System.out.println(result);
        System.out.println(rotateSearchK(new int[]{4, 5, 6, 7, 0, 1, 2, 3}, 4));
    }
}
