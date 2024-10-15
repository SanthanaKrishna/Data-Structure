package org.DSA.Hashing;

import java.util.HashMap;

/**
 * Count the number of pairs with sum = K
 * arr=[2 5 2 5 8 5 2 8]
 */
public class CountPairSumK {
    static int countNoPairSum(int[] arr, int K) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int b = K - arr[i];
            if (hm.containsKey(b)) {
                ans += hm.get(b);
            }
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 5, 8, 5, 2, 8};
        int K = 10;
        int result = countNoPairSum(arr, K);
        System.out.println(result);
    }
}
