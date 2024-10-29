package org.DSA.Searching;

/**
 * [Sorted Insert Position]
 * You are given a sorted array A of size N and a target value B.
 * Your task is to find the index (0-based indexing) of the target value in the array.
 * If the target value is present, return its index.
 * If the target value is not found, return the index of least element greater than equal to B.
 * If the target value is not found and least number greater than equal to target is also not present, return the length of array (i.e. the position where target can be placed)
 * Your solution should have a time complexity of O(log(N)
 * Input 1: A = [1, 3, 5, 6] B = 5   Output 1: 2
 * Input 2: A = [1, 4, 9] B = 3  Output 2: 1
 * Explanation 1: The target value is present at index 2.
 * Explanation 2: The target value should be inserted at index 1
 */
public class SearchInsertPosition {

    static int findIndexPosition(int[] arr, int K) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                return mid;
            } else if (arr[mid] < K) {
                left = mid + 1;
            } else if (arr[mid] > K) {
                right = mid - 1;
            }
        }
        // If B is not found, `left` will be the insertion point
        return left;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6};
        int B = 5;
        int result = findIndexPosition(A, B);
        System.out.println(result);
    }
}
