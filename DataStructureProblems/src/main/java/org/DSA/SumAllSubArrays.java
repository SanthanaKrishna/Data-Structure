package org.DSA;

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
