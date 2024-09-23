package org.DSA;

public class AddBinaryString {

    static int[][] GenerateAllSubArrays(int[] arr) {
        int n = arr.length;
        int totalSubArray = n * (n + 1) / 2;
        int[][] ans = new int[totalSubArray][]; //colums are not required to add bcoz
        //2D is combination of 1D array, 1D array reference will stored in final 1D array that actually behave 2D array
        int i=0;
        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {
                int subArraySize = (ei - si) + 1;
                int[] subArray = new int[subArraySize];
                for (int k = si, j = 0; k <= ei; k++, j++) {
                    subArray[j]= arr[k];
                }
                //add this 1D array  into our 2D ans array
                ans[i]=subArray;
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
