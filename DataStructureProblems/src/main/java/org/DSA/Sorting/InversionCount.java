package org.DSA.Sorting;

/**
 * Inversion count in an array
 * Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. \
 * Find the total number of inversions of A modulo (109 + 7).
 * Input 1: A = [1, 3, 2] Output 1: 1
 * Input 2: A = [3, 4, 1, 2]  Output 2: 4
 * Explanation 1:  The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 * Explanation 2:
 * The pair (0, 2) is an inversion as 0 < 2 and A[0] > A[2]
 * The pair (0, 3) is an inversion as 0 < 3 and A[0] > A[3]
 * The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 * The pair (1, 3) is an inversion as 1 < 3 and A[1] > A[3]
 */
public class InversionCount {
    private static final int MOD = 1_000_000_007;

    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        long invCount = 0;

        // Merge two halves and count inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // All elements from arr[i] to arr[mid] are greater than arr[j]
                invCount += (mid + 1 - i);
                invCount %= MOD;
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy merged elements back into the original array
        System.arraycopy(temp, left, arr, left, right - left + 1);

        return invCount;
    }

    private static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = (left + right) / 2;
        long invCount = 0;

        // Count inversions in the left half
        invCount += mergeSortAndCount(arr, temp, left, mid);
        invCount %= MOD;

        // Count inversions in the right half
        invCount += mergeSortAndCount(arr, temp, mid + 1, right);
        invCount %= MOD;

        // Count inversions during the merge step
        invCount += mergeAndCount(arr, temp, left, mid, right);
        invCount %= MOD;

        return invCount;
    }

    static int findPair(int[] arr) {
        int[] temp = new int[arr.length];
        return (int) (mergeSortAndCount(arr, temp, 0, arr.length - 1) % MOD);
//        int ans = 0;
//        for (long i = 0; i < arr.length; i++) {
//            for (long j = 0; j < arr.length; j++) {
//                if (i < j) {
//                    if (arr[(int) i] > arr[(int) j]) {
//                        ans++;
//                    }
//                }
//            }
//        }
//        return (int) ans;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 1, 2};
        int result = findPair(A);
        System.out.println(result);
    }
}
