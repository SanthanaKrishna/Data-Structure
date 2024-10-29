package org.DSA.Searching;

import java.util.Arrays;

/**
 * [Search for a Range]
 * Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.
 * Return an array of size 2, such that
 * First element = Left most index of B in A
 * Second element = Right most index of B in A.
 * If B is not found in A, return [-1, -1].
 * Note : Note: The time complexity of your algorithm must be O(log n)
 * Input 1: A = [5, 7, 7, 8, 8, 10] B = 8  Output 1: [3, 4]
 * Input 2: A = [5, 17, 100, 111] B = 3  Output 2: [-1, -1]
 * Input 3: A = {1, 2, 5, 5, 5, 7, 8, 8, 8, 10, 12, 12, 15, 15, 15} B = 8   Output 3: [6, 8]
 * Explanation 1:
 * The first occurrence of 8 in A is at index 3.
 * The last occurrence of 8 in A is at index 4.
 * ans = [3, 4]
 * Explanation 2: There is no occurrence of 3 in the array.
 * Time Complexity: O(log n)  for each binary search, so the total complexity is O(log n)
 * Space Complexity: O(1), Since we are using a constant amount of extra space
 */
public class SearchFirstLastOccurrenceRangeK {
    static int findFirstMost(int[] arr, int K) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < K) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    static int findLastMost(int[] arr, int K) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == K) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < K) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    static int[] SearchRange(int[] arr, int K) {
        if (arr.length == 1) return new int[]{0, 0};
        int leftMost = findFirstMost(arr, K);
        int rightMost = findLastMost(arr, K);
        if (leftMost == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{leftMost, rightMost};
    }

    public static void main(String[] args) {
        int[] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        int[] result = SearchRange(A, B);
        int[] result1 = SearchRange(new int[]{1, 2, 5, 5, 5, 7, 8, 8, 8, 10, 12, 12, 15, 15, 15}, 8);
        int[] result2 = SearchRange(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 10);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
