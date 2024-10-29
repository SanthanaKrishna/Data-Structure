package org.DSA.Searching;

public class PeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            boolean isLeftGreater = (mid > 0) ? arr[mid] >= arr[mid - 1] : true;
            boolean isRightGreater = (mid < n - 1) ? arr[mid] >= arr[mid + 1] : true;

            if (isLeftGreater && isRightGreater) {
                return arr[mid];
            }

            // Move to the side where there is a greater element
            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If we exit the loop, return -1 (should not happen in this problem as a peak is guaranteed)
        return -1;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5};
        System.out.println(findPeakElement(A1)); // Output: 5

        int[] A2 = {5, 17, 100, 11};
        System.out.println(findPeakElement(A2)); // Output: 100
    }
}
