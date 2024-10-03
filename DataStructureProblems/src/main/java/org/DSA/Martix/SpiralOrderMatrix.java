package org.DSA.Martix;

import java.util.Arrays;

/**
 * Spiral Order Matrix II
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 */
public class SpiralOrderMatrix {

//    static int[][] boundaryElement(int num) {
//        int[][] matix = new int[num][num];
//        int top = 0, bottom = num - 1, left = 0, right = num - 1;
//        int value = 1;
//        while (top <= bottom && left <= right) {
//            for (int i = left; i <= right; i++) {
//                matix[top][i] = value++;
//            }
//            top++;
//
//            for (int i = top; i <= bottom; i++) {
//                matix[i][right] = value++;
//            }
//            right--;
//
//            if (top <= bottom) {
//                for (int i = right; i >= left; i--) {
//                    matix[bottom][i] = value++;
//                }
//                bottom--;
//            }
//
//            if (left <= right) {
//                for (int i = bottom; i >= top; i--) {
//                    matix[i][left] = value++;
//                }
//                left++;
//            }
//        }
//        return matix;
//    }

    static int[][] generateMatrix(int num){
        int[][] arr= new int[num][num];
        int i=0,j=0, value=1;
        while(num >1){
            for(int k=1; k<num; k++){
                arr[i][j]= value++;
                j++;
            }
            for(int k=1; k<num; k++){
                arr[i][j]= value++;
                i++;
            }
            for(int k=1; k<num; k++){
                arr[i][j]= value++;
                j--;
            }
            for(int k=1; k<num; k++){
                arr[i][j]= value++;
                i--;
            }
            i +=1;
            j +=1;
            num -=2;
        }
        if(num ==1){
            arr[i][j]= value;
        }
        return arr;
    }
    public static void main(String[] args) {
        int A = 5;
        int[][] result = generateMatrix(A);
        System.out.println(Arrays.deepToString(result));
    }
}
