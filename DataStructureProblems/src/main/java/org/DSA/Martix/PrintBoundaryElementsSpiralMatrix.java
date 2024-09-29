package org.DSA.Martix;

import java.util.*;

public class PrintBoundaryElementsSpiralMatrix {

    static ArrayList<Integer> findBoundaryElement(int[][] arr, int n, int m, int i, int j) {
        ArrayList<Integer> boundaryArr = new ArrayList<Integer>();
        for (int k = 0; k < m; k++) {
            boundaryArr.add(arr[i][j]);
            j++;
        }
        j--;
        i++;
        for (int k = 0; k < n-1; k++) {
            boundaryArr.add(arr[i][j]);
            i++;
        }
        i--;
        j--;
        for (int k = 0; k < m-1; k++) {
            boundaryArr.add(arr[i][j]);
            j--;
        }
        j++;
        i--;
        for (int k = 0; k < n-2; k++) {
            boundaryArr.add(arr[i][j]);
            i--;
        }
        return boundaryArr;
    }

    static ArrayList<ArrayList<Integer>> printBoundaryElements(int[][] arr) {
        int rowLen = arr.length, colLen = arr[0].length, index = 0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        while (rowLen > 0 && colLen > 0) {
            ArrayList<Integer> boundary = findBoundaryElement(arr, rowLen, colLen, index, index);
            result.add(boundary);
            index++;
            rowLen = rowLen - 2;
            colLen = colLen - 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        ArrayList<ArrayList<Integer>> result = printBoundaryElements(arr);
        System.out.println(result);
    }
}
