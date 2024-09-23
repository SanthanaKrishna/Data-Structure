package org.DSA;

import java.util.Arrays;

public class RemoveElementCost {
    static int costElement(int [] arr){
        int n= arr.length, cost =0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<n; i++){
            int sum= arr[i]* (n-i);
            System.out.println(sum);
            cost = cost+sum;
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr= {2, 1, 4};
        int result=costElement(arr);
        System.out.println(result);
    }
}
