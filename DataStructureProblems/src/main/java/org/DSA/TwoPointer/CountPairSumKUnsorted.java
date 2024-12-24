package org.DSA.TwoPointer;

import java.util.HashMap;

public class CountPairSumKUnsorted {
    public static int countPairs(int[] arr, int K) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = K - num;

            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int K = 6;
        int result = countPairs(arr, K);
        System.out.println("Number of pairs: " + countPairs(arr, K)); // Output: 4
    }
}
