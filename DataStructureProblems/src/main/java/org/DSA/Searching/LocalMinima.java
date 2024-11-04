package org.DSA.Searching;

/**
 * Given arr[ N ] with distinct elements, find any one local minima.
 * Local Minima : An element which is less than it's adjacent elements.
 * Input: {21, 20, 19, 17, 15, 9, 7}; Output: 7
 * Input: {5,9,15, 20, 25, 30} Output: 5
 * Input: {5, 8, 12, 3} Output: 5, 3
 */
public class LocalMinima {

    static int findLocalMinValue(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        // Edge case: If there's only one element, it is the local minima
        if (arr.length == 1) return arr[0];
        while (left <= right) {
            //mid = left + (right - left) / 2  --> this is for larger values
            int middle = (left + right) / 2;

            //check if middle element is local minima
            boolean isLeftSmaller = (middle == 0) || (arr[middle] < arr[middle - 1]);
            boolean isRightSmaller = (middle == n - 1) || (arr[middle] < arr[middle + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return arr[middle];
            }
            //// Move to the side which has a smaller neighbor, as it guarantees a local minima
            if (middle > 0 && arr[middle - 1] > arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 6, 1, 0, 9, 15, 8}; //ans= 3, 0,8
        int result= findLocalMinValue(A);
        System.out.println(result);

    }
}
