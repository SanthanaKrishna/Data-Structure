package org.DSA.TwoPointer;

import java.util.Arrays;

public class CountPairSumKTwoPointer {

    public static int countPairs(int[] arr, int K) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1, count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == K) {
                // Case 1: Both left and right point to the same value
                if (arr[left] == arr[right]) {
                    int totalElements = right - left + 1;
                    count += (totalElements * (totalElements - 1)) / 2;  //nC2
                    break;
                }
                // Case 2: Count occurrences of the left and right values
                int leftCount = 1;
                int rightCount = 1;

                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                    leftCount++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                    rightCount++;
                }
                count += (leftCount * rightCount); // Add the product of counts of left and right values to the result
                left++;
                right--;
            } else if (sum < K) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 5, 5, 5, 5, 8, 9}; // Sorted array
        int K = 10;

        // Count and display the result
        int result = countPairs(arr, K);
        System.out.println("Number of pairs with sum equal to " + K + ": " + result);
    }
}
