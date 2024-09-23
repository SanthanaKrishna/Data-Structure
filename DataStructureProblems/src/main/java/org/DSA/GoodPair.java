package org.DSA;

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
        int result = findGoodPair(A,B);
        System.out.println(result);
    }
}
