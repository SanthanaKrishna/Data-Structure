package org.DSA.Hashing;

import java.util.*;

/**
 * Common Elements
 * Given two integer arrays, A and B of size N and M, respectively.
 * Your task is to find all the common elements in both the array.
 * NOTE:
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 * Input 1: A = [1, 2, 2, 1] B = [2, 3, 1, 2]    Output 1: [1, 2, 2]
 * Input 2:  A = [2, 1, 4, 10] B = [3, 6, 2, 10, 10]   Output 2: 2, 10]
 * Explanation 1: Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
 * Explanation 2: Elements (2, 10) appears in both the array.
 */
public class CommonElements {

    static ArrayList<Integer> findRepeatingElements(int[] A, int[] B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
//            if (hm.containsKey(A[i])) {
//                hm.put(A[i], hm.get(A[i] + 1));
//            } else {
//                hm.put(A[i], 1);
//            }
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        for (int j = 0; j < B.length; j++) {
            if (hm.containsKey(B[j]) && hm.get(B[j]) > 0) {
                result.add(B[j]);
                hm.put(B[j], hm.get(B[j]) - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] A = {2, 1, 4, 10}, B = {3, 6, 2, 10, 10};
        int[] A = {1, 2, 2, 1}, B = {2, 3, 1, 2};
        ArrayList<Integer> result = findRepeatingElements(A, B);
        Collections.sort(result);
        System.out.println(result);
    }
}
