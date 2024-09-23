package org.DSA;

import java.util.Arrays;

/**
 * Rain Water Trapping
 * Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
 * Your task is to calculate the total amount of water that can be trapped in these valleys.
 * Example:
 * The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.
 * Input Format: First and only argument is the Integer Array, A.
 * Output Format: Return an Integer, denoting the total amount of water that can be trapped in these valleys
 * Input 1: A = [0, 1, 0, 2] Input 2: A = [1, 2] Input 3: [4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3]
 * Output 1: 1 Output 2: 0 Output 3: 16
 */
public class RainWaterTrapping {

    static int sumRainWaterTrapping(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int sum = 0, left = 0, right = n - 1, leftMax = arr[0], rightMax = arr[n - 1];
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    sum += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    sum += rightMax - arr[right];
                }
                right--;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
//        int[] arr = {40, 74, 26, 59, 60, 89, 67, 34, 14, 72, 88, 59, 13, 51, 61, 57, 7, 58, 38, 20, 48, 30, 77, 67, 61, 49, 46, 34, 34, 98, 15, 22, 48, 100, 74, 57, 43, 83, 51, 83, 40, 89, 40, 60, 14, 46, 27, 29, 10, 9, 4, 20, 31, 37, 90, 80, 28, 79, 88, 100, 51, 20, 15, 31, 36, 97, 46, 54, 35, 33, 8, 68, 92, 20, 100, 60, 62, 94, 8, 61, 93, 39, 94, 88, 67, 92, 6, 97, 36, 77, 58, 56, 97, 24, 8, 35, 92, 3, 36, 84, 22, 28, 55, 60, 96, 50, 20, 44, 26, 87, 79, 77, 43, 65, 54, 85, 20, 22, 58, 50, 61, 73, 37, 87, 96, 68, 39, 90, 41, 10, 62, 16, 34, 76, 0, 25, 12, 62, 29, 75, 67, 54, 78, 24, 52, 71, 16, 82, 14, 79, 86, 40, 74, 83, 24, 39, 76, 47, 68, 97, 79, 55, 76, 88, 11, 35, 62, 51, 57, 81, 71, 54, 27, 65, 82, 17, 2, 18, 8, 94, 68, 18, 33, 52, 31, 27, 47, 76, 38, 10, 37, 78, 72, 48, 52, 91, 74, 0, 3, 31, 94, 31, 15, 80, 20, 65, 90, 27, 85, 41, 25, 56, 49, 2, 86, 22, 59, 39, 21, 46, 85, 25, 70, 29, 0, 81, 60, 15, 52, 26, 47, 1, 31, 36, 80, 48, 44, 50, 88, 42, 69, 16, 8, 94, 0, 57, 58, 42, 90, 38, 3, 83, 67, 96, 47, 49, 27, 62, 23, 100, 1, 35, 42, 97, 44, 8, 94, 64, 10, 87, 25, 5, 45, 78, 77, 71, 54, 88, 41, 46, 90, 18, 51, 82, 17, 49, 15, 68, 25, 28, 62, 10, 91, 48, 89, 56, 87, 6, 35, 2, 33, 33, 38, 67, 57, 56, 3, 49, 44, 76, 3, 27, 51, 25, 15, 87, 31, 43, 35, 6, 61, 51, 45, 62, 69, 40, 47, 6, 55, 28, 51, 21, 48, 59, 88, 71, 69, 16, 87, 73, 48, 84, 9, 58, 9, 99, 48, 97, 45, 43, 53, 53, 6, 9, 86, 73, 52, 14, 78, 72, 97, 85, 26, 89, 76, 100, 85, 49, 62, 14, 58, 97, 31, 63, 60, 21, 44, 10, 42, 78, 84, 54, 56, 52, 84, 72, 97, 28, 65, 89, 1, 91, 51, 39, 30, 46, 68, 4, 21, 76, 67, 24, 84, 47, 19, 9, 24, 38, 70, 40, 98, 29, 30, 5, 35, 48, 47, 0, 47, 6, 26, 43, 30, 54, 60, 54, 32, 94, 26, 64, 59, 14, 1, 44, 29, 5, 11, 97, 27, 58, 56, 37, 1, 99, 67, 3, 1, 35};
//        int[] arr = {23, 67, 89, 34, 56, 78, 12, 45, 89, 71, 32, 54, 76, 98, 42, 35, 67, 83, 85};
        int result = sumRainWaterTrapping(arr);
        System.out.println(result);
    }
}
