package org.DSA.Searching;

import java.util.Arrays;

/**
 * Aggressive cows
 * Farmer John has built a new long barn with N stalls.
 * Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.
 * His cows don't like this barn layout and become aggressive towards each other once put into a stall.
 * To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible.
 * What is the largest minimum distance?
 * Input 1: A = [1, 2, 3, 4, 5]  B = 3   Output 1: 2
 * Input 2: A = [1, 2] B = 2   Output 2: 1
 * Explanation 1: John can assign the stalls at location 1, 3 and 5 to the 3 cows respectively. So the minimum distance will be 2.
 * Explanation 2: The minimum distance will be 1
 */
public class AggressiveCows {
    static boolean canPlaceCows(int[] arr, int K, int minDist) {
        int cows = 1; // Place the first cow in the first stall
        int prev_index = 0;  // Last placed cow's index
        for (int i = 1; i < arr.length; i++) {
            int checkRange = arr[i] - arr[prev_index];
            if (checkRange >= minDist) {   // Check if the next cow can be placed
                cows++;      // Place the cow
                prev_index = i;   // Update the position of the last placed cow
                if (cows == K) return true;   // If all cows are placed, return true
            }
        }
//        if (cows >= K) return true;
        return false;
    }

    static int largestMinDistance(int[] arr, int K) {
        Arrays.sort(arr);
        int n = arr.length;
        int left = 1; // Minimum possible distance
        int right = arr[n - 1] - arr[0]; // Maximum possible distance
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceCows(arr, K, mid)) {
                ans = mid;  // If possible to place cows with `mid` distance, update answer
                left = mid + 1;   // Try for a larger minimum distance
            } else {
                right = mid - 1; // Try for a smaller distance
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 11, 14, 19, 25, 30, 39, 43};
        int result = largestMinDistance(A, 3);
        System.out.println(result);
        System.out.println(largestMinDistance(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
