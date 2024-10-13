package org.DSA.SubArrays;

/**
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 * Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.
 * Input 1: A = [1, 2, 3] Output 1: 20
 * Input 2: A = [2, 1, 3] Output 2: 19
 * Explanation 1:
 *   The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
 *   Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
 * Explanation 2:
 *   The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
 *   Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
 */
public class SumAllSubArrays {
//    public long subarraySum(int[] A) {
//        long ans = 0;
//        int n = A.length;
//        for (int i = 0; i < n; i++)
//            ans += (long)A[i] * (i + 1) * (n - i);
//        return ans ;
//    }
    static long subArraySum(int[] A) {
        long n= A.length;
        long start, end, subArrays, contribution, total=0;
        for(int i=0; i<n; i++){
            start= i+1;
            end= n-i;
            subArrays= start*end;
            contribution= subArrays*A[i];
            total += contribution;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 3};
        long result = subArraySum(arr);
        System.out.println(result);
    }
}
