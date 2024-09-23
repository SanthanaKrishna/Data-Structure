package org.DSA;

/** Max Sum Contiguous Subarray
 * Given arr[N]. Find the maximum subArray sum out of all subArrays.
 * [  -3   ,   2   ,   4   ,   -1   ,   3   ,   -4   ,   3  ] --> ans = 8 from [2, 4, -1, 3];
 * Input Format: The first and the only argument contains an integer array, A.
 * Output Format: Return an integer representing the maximum possible sum of the contiguous subarray.
 * Input 1:A = [1, 2, 3, 4, -10]  Output 1: 10
 * Input 2: A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] Output 2: 6
 * Explanation 1: The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
 * Explanation 2: The subarray [4,-1,2,1] has the maximum possible sum of 6.
 */
public class SubArrayMaxSubArraySum {

    static int maxSubArraySum(int[] arr) {
        int sum = arr[0], maxValue = arr[0], n = arr.length;
        for (int i = 1; i < n; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += arr[i];
            if(maxValue < sum){
                maxValue= sum;
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        int[] arr = {-3, 2, 4, -1, 3, -4, 3};
        int result = maxSubArraySum(arr);
        System.out.println(result);
    }
}
