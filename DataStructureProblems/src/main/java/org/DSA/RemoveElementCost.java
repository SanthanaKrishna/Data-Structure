package org.DSA;

import java.util.Arrays;

/**
 * Given an integer array A of size N. You can remove any element from the array in one operation.
 * The cost of this operation is the sum of all elements in the array present before this operation.
 * Find the minimum cost to remove all elements from the array.
 * Input 1: A = [2, 1]  Output 1: 4
 * Input 2: A = [5] Output 1: 5
 * Explanation 1:
 * Given array A = [2, 1]
 * Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
 * Remove 1 from the array => []. Cost of this operation is (1) = 1.
 * So, total cost is = 3 + 1 = 4.
 * Explanation 2:
 * There is only one element in the array. So, cost of removing is 5.
 */
public class RemoveElementCost {
    static int costElement(int[] arr) {
        int n = arr.length, cost = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            int sum = arr[i] * (n - i);
            System.out.println(sum);
            cost = cost + sum;
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        int result = costElement(arr);
        System.out.println(result);
    }
}
