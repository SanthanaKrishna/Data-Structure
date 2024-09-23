package org.DSA;

import java.util.Arrays;

public class ReverseArrayInRange {
    static int[] reverseArray(int[] A, int B, int C){
        while(B < C){
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        return A;
    }
    public static void main(String[] args) {
       int[] A = {1, 2, 3, 4};
        int B = 2, C = 3;
        int[] result= reverseArray(A, B, C);
        System.out.println(Arrays.toString(result));
    }
}
