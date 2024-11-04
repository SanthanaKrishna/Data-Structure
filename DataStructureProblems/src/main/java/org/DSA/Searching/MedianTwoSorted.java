package org.DSA.Searching;

public class MedianTwoSorted {
    static int findMedianSortedArrays1(int[] A, int[] B) {
        if (A.length > B.length) {
            // Ensure that we always binary search on the smaller array
            return findMedianSortedArrays(B, A);
        }

        int M = A.length;
        int N = B.length;
        int totalLength = M + N;
        int halfLength = (totalLength + 1) / 2;

        int left = 0;
        int right = M;

        while (left <= right) {
            int partitionA = left + (right - left) / 2;
            int partitionB = halfLength - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == M) ? Integer.MAX_VALUE : A[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == N) ? Integer.MAX_VALUE : B[partitionB];

            // Check if we have found the correct partition
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if (totalLength % 2 == 0) {
                    // Even length, take the average of the middle two values
                    return (int) ((Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0);
                } else {
                    // Odd length, return the middle value
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Move partitionA to the left
                right = partitionA - 1;
            } else {
                // Move partitionA to the right
                left = partitionA + 1;
            }
        }

        // If we reach here, there was no valid median, which shouldn't happen with correct input
        throw new IllegalArgumentException("Input arrays are not sorted or not of expected form.");
    }

    static int findMedianSortedArrays(int[] arrA, int[] arrB) {
        int N = arrA.length, M = arrB.length;
        if (N > M) return findMedianSortedArrays1(arrB, arrA);
        int left_half_req = (N + M + 1) / 2;
        int start = 0, end = N;
        while (start <= end) {
            int mid = (start + end) / 2;
            int fromA = mid;
            int fromB = left_half_req - fromA;
            int l1 = (fromA == 0) ? Integer.MIN_VALUE : arrA[fromA - 1];
            int l2 = (fromB == 0) ? Integer.MIN_VALUE : arrB[fromB - 1];
//            int r1 = l1 + 1, r2 = l2 + 1;
            int r1 = (fromA == N) ? Integer.MAX_VALUE : arrA[fromA];
            int r2 = (fromB == M) ? Integer.MAX_VALUE : arrB[fromB];
            if (l1 <= r2 && l2 <= r1) {
                if (((N + M) & 1) == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                } else {
                    return Math.max(l1, l2);
                }
            }
            if (l1 > r2) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {7, 12, 14, 15, 16, 20};
        int[] B = {1, 2, 3, 4, 9, 11}; //ans = 10
        int[] X = {7, 12, 14};
        int[] Y = {1, 2, 3, 4}; //ans = 4
//        A = [1, 3, 8, 9, 15]
//        B = [7, 11, 18, 19, 21, 25]

//        A = [1, 2, 3]
//        B = [10, 11, 12]
//        A = [1, 4, 7, 10, 13]
//        B = [2, 3, 8, 12, 15]


        int result = findMedianSortedArrays(A, B);
        System.out.println(result);
        System.out.println(findMedianSortedArrays(X, Y));
    }
}
