package org.DSA.SubArrays;

import java.util.Arrays;

public class SubArrayGivenRange {
    static int[] solve(int[] A, int B, int C) {
        int[] result = new int[C - B + 1];
        int index=0;
        for (int i = B; i <= C; i++) {
            result[index] = A[i];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 3, 6, 7, 8, 7, 3, 7};
        int B = 1;
        int C = 2;
        int[] result = solve(arr, B, C);
        System.out.println(Arrays.toString(result));
    }
}
