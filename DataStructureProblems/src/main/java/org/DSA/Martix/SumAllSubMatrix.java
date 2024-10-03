package org.DSA.Martix;

public class SumAllSubMatrix {

    static long sumSubMatrix(int[][] arr) {
        long rowLen = arr.length, colLen = arr[0].length, total = 0;
        long TL, BR, subMatrix, contribution;
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                TL = (long) (i + 1) * (j + 1);
                BR = (rowLen - i) * (colLen - j);
                subMatrix = TL * BR;
                contribution = subMatrix * arr[i][j];
                total += contribution;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 9, 6}, {5, -1, 2}};
        long result = sumSubMatrix(arr);
        System.out.println(result);
    }
}
