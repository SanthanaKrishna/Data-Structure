package org.DSA.SubArrays;

/**  Carry Forward & SubArrays - Closest MinMax
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 * and at least one occurrence of the minimum value of the array.
 * Input 1: A = [1, 3, 2]  Output 1: 2
 * Input 2: A = [2, 6, 1, 6, 9]  Output 2: 3
 * Explanation 1: Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
 * Explanation 2: Take the last 3 elements of the array
 */
public class ClosestMinMaxSmallestSubArray {

//    public int solve(int[] A) {
//
//        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;   // min and max value of the array
//        int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele
//
//        int ans = Integer.MAX_VALUE;
//        for(int x:A){
//            min_ele = Math.min(min_ele, x);
//            max_ele = Math.max(max_ele, x);
//        }
//
//        for(int i=0 ; i<A.length ; i++){
//            if(A[i] == min_ele) min_Index = Math.max(min_Index, i);
//            if(A[i] == max_ele) max_Index = Math.max(max_Index, i);
//
//            if(min_Index != -1 && max_Index != -1){
//                int len = Math.abs(max_Index - min_Index) + 1;
//                ans = Math.min(ans, len);
//            }
//        }
//
//        return ans;
//    }

    static int [] minMax(int []arr, int n){
        int min=arr[0], max=arr[0];
        for(int i=1; i<n; i++){
            if(min > arr[i]){
                min= arr[i];
            }else if(max < arr[i]){
                max= arr[i];
            }
        }
        return new int[]{min, max};
    }
    static int closestMinMax(int[] A) {
        int n= A.length;
        int[] result= minMax(A, n);

        int minIndex=-1, maxIndex=-1, smallestSubArray= n, min= result[0], max=result[1];
        if(min == max){
            return 1;
        }
        for(int i=0; i<n; i++){
            if(min == A[i]){
                minIndex=i;
                if(maxIndex != -1){
                    int currentSubArray= minIndex-maxIndex+1;
                    if(currentSubArray < smallestSubArray){
                        smallestSubArray= currentSubArray;
                    }
                }
            }else if(max==A[i]){
                maxIndex= i;
                if(minIndex !=-1){
                    int currentSubArray= maxIndex-minIndex+1;
                    if(currentSubArray < smallestSubArray){
                        smallestSubArray= currentSubArray;
                    }
                }
            }
        }
        return smallestSubArray;
    }

    public static void main(String[] args) {
        int[] arr = {814,761,697,483,981};
        int result = closestMinMax(arr);
        System.out.println(result);
    }
}


