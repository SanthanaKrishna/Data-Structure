package org.DSA.SubArrays;

/**
 * You are given an integer array C of size A.
 * Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 * Input 1: A = 5 B = 12 C = [2, 1, 3, 4, 5] Output 1: 12
 * Input 2: A = 3 B = 1 C = [2, 2, 2] Output 1: 0
 */
public class MaximumSubArray {
    //    public int maxSubarray(int A, int B, int[] C) {
//        int ans = 0;
//        for (int i = 0; i < A; i++) {
//            int sum = 0;
//            for (int j = i; j < A; j++) {
//                sum += C[j];
//                if (sum <= B)
//                    ans = Math.max(ans, sum);
//                else break;
//            }
//        }
//        return ans;
//    }
    static int maxSubArray(int A, int B, int[] C) {
        int currentSum = 0, j = 0, maxSum = 0;
        for (int i = 0; i < A; i++) {
            currentSum += C[i];
            while (currentSum > B) {
                currentSum -= C[j];
                j++;
            }
            if (currentSum <= B && currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int A = 5, B = 12;
        int[] C = {2, 1, 3, 4, 5};
        int result = maxSubArray(A, B, C);
        System.out.println(result);
    }
}
