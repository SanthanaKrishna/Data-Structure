package org.DSA.SubArrays;
import java.util.Arrays;

/** Carry Forward & SubArrays -  Generate all subarrays
 * You are given an array A of N integers.
 * Return a 2D array consisting of all the subarrays of the array
 * Note : The order of the subarrays in the resulting 2D array does not matter.
 * Input 1: A = [1, 2, 3]   Output 1: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
 * Input 2: A = [5, 2, 1, 4]  Output 2: [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
 * For Input 1: All the subarrays of the array are returned. There are a total of 6 subarrays.
 * For Input 2: All the subarrays of the array are returned. There are a total of 10 subarrays.
 */
public class GenerateAllSubArray {
    static int[][] allSubArray(int[] arr) {
        int n = arr.length;
        int totalSubArray = n * (n + 1) / 2;
        int[][] result = new int[totalSubArray][];
        System.out.println(Arrays.toString(result));
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subArraySize = j - i + 1;
                result[index] = new int[subArraySize];
                for (int k = 0; k < subArraySize; k++) {
                    result[index][k] = arr[i + k];
                }
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[][] subArrays = allSubArray(arr);
//        int[]subArrays = allSubArray(arr);
        System.out.println(Arrays.deepToString(subArrays));
    }
}
