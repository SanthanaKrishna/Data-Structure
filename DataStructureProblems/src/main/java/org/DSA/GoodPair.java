package org.DSA;

/**
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
 * Check if any good pair exist or not.
 * Input 1: A = [1,2,3,4] B = 7  Output 1: 1
 * Input 2: A = [1,2,4] B = 4  Output 2: 0
 * Input 3: A = [1,2,2] B = 4  Output 3: 1
 */
public class GoodPair {
    static int findGoodPair(int[] A, int B) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 7;
        int result = findGoodPair(A, B);
        System.out.println(result);
    }
}
