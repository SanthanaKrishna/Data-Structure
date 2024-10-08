package org.DSA.Recursion;

import java.util.Arrays;

public class PrintIndicesGivenValue {
    static int[] FindIndicesB(int[] arr, int B, int index, int count) {
        if (index == arr.length) {
//            int[] indicesArr = new int[count];
//            return indicesArr;
            return new int[count];
        } else if (arr[index] == B) {
            int[] indicesArr = FindIndicesB(arr, B, index + 1, count + 1);
            indicesArr[count] = index;
            return indicesArr;
        } else {
            return FindIndicesB(arr, B, index + 1, count);
        }
    }

    public static void main(String[] args) {
        int[] A = {8, 9, 5, 6, 5, 5};
        int B = 5;
        int[] result = FindIndicesB(A, B, 0, 0);
        System.out.println(Arrays.toString(result));
    }
}
