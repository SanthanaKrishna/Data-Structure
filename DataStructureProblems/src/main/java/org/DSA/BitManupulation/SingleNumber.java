package org.DSA.BitManupulation;

/**
 * Given N elements every element repeats twine expect one. Find unique element
 * Arr=[3,2,3,7,2,8,7] output: 8
 */
public class SingleNumber {
    static int findUniqueNumber(int[] arr) {
        int n = arr.length, ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) > 0) {
                    count++;
                }
            }
            if ((count & 1) == 1) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 7, 8, 7};
        int result = findUniqueNumber(arr);
        System.out.println(result);
    }
}
