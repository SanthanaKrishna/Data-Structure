package org.DSA;

/**
 * Find floor ( sqrt (N) )
 * N =10 --> 3
 * N=16 --> 4
 * N=19 --> 5
 * Time Complexity : O(sqrt(N))
 */
public class FindFloorSqrtN {
    static int sqrtN(int N) {
        int ans = -1;
        for (int i = 1; i <= N; i++) {
            if (i * i <= N) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 29;
        int result = sqrtN(N);
        System.out.println(result);
        System.out.println(sqrtN(16));
    }
}
