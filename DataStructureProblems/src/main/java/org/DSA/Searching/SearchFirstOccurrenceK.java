package org.DSA.Searching;

/**
 * Given a sorted arr[ N ]. Find first occurrence of K.
 */
public class SearchFirstOccurrenceK {
    static int findFirstK(int[] arr, int K) {
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == K) {
                ans = middle;
                right = middle - 1;
            }
            if (arr[middle] < K) {
                left = middle + 1;
            } else if (arr[middle] > K) {
                right = middle - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-5, -5, -3, 0, 0, 1, 5, 5, 5, 5, 5, 8, 10, 10, 15};
        int K = 5;
        int result = findFirstK(A, K);//1
        System.out.println(result);
        System.out.println(findFirstK(A, 3));//0
    }
}
