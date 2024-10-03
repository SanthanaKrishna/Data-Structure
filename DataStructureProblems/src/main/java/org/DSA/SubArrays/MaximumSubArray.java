package org.DSA.SubArrays;

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
