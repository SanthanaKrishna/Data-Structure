package org.DSA.Searching;

/**
 * [Single Element in Sorted Array]
 * Every element occurs twice except for 1.
 * Find that unique element.
 * Note: Duplicates are adjacent to each other and array isn't necessarily sorted.
 * <p>
 * Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.
 * Elements which are appearing twice are adjacent to each other.
 * NOTE: Users are expected to solve this in O(log(N)) time.
 * Input 1: {8, 8, 5, 5, 9, 9, 6, 2, 2, 4, 4}   Output 1 : 6
 * Time Complexity: O(log n)
 */
public class FindUniqueElementFromDuplicate {
    static int findUniqueElement(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if ((middle == 0 || (arr[middle - 1] != arr[middle])) && (middle == n - 1 || (arr[middle] != arr[middle + 1]))) {
                return arr[middle];
            } else if (arr[middle] != arr[middle - 1]) { // i'm in first occ
                if ((middle & 1) == 0) { //index of first occ is even
                    left = middle + 2;
                } else {//index of first occ is odd
                    right = middle - 1;
                }
            } else {  //i'm is second occurrence
//                if ((middle & 1) == 0) {
//                    right = middle - 2;
//                } else {
//                    left = middle + 1;
//                }
                //OR
                middle = middle - 1; // go to first occ
                if ((middle & 1) == 0) { //index of first occ is even
                    left = middle + 2;
                } else {//index of first occ is odd
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

    static int findUniqueElement2(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] A = {8, 8, 5, 5, 9, 9, 6, 2, 2, 4, 4};
        int result = findUniqueElement2(A);
        System.out.println(result);
    }
}
