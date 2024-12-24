package org.DSA.TwoPointer;

public class PairDifferenceK {
    public static boolean findDifference(int[] arr, int K) {
        int left = 0, right = 1, n = arr.length;
        while (right < n) {
            int diff = arr[right] - arr[left];
            if (diff == K) return true;
            if (diff > K) {
                left++;
            } else {
                right++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 3, 6, 8, 11, 14, 21, 25};
        int K = 5;
        boolean result = findDifference(arr, K);
        System.out.println("Pair with given Difference of" + K + " is " + result);
    }
}
