package org.DSA.Searching;

/**
 * Given a sorted arr[  ].
 * Search an element K.
 * If K is present return it's index otherwise return -1.
 * Time Complexity of Binary Search : O(log n)
 * n/2--> n/4 --> n/8 --> .... 1/0
 */
public class BinarySearch {
    static int findElement(int[] arr, int K) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;  //middle formula = (a+b)/2
            if (arr[middle] == K) {
                return middle;
            } else if (arr[middle] < K) {
                left = middle + 1;
            } else if (arr[middle] > K) {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 9, 12, 14, 19, 20, 23, 25, 27};
        int K = 23;
//        int K=20;
        int result = findElement(A, K);
        System.out.println(result);
        System.out.println(findElement(A, 21));
    }
}
