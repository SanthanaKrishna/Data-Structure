package org.DSA.ModularArithmeticAndGCD;

/**
 * Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
 * Since the answer may be large, return the answer modulo (109 + 7).
 * Note: Ensure to handle integer overflow when performing the calculations.
 * Input 1: A = [1, 2, 3, 4, 5] B = 2   Output 1: 4
 * Input 2: A = [5, 17, 100, 11] B = 28   Output 2: 1
 * Explanation 1: All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5). So total 4 pairs.
 * Explanation 2: There is only one pair which is divisible by 28 is (17, 11)
 */
public class PairSumDivisibleByM {

    static int pairSum(int[] arr, int m) {
        int ans = 0;
        int[] freqArr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            int modValue = arr[i] % m;
            freqArr[modValue]++;
        }
        ans += ((freqArr[0] * (freqArr[0] - 1)) / 2);
        //when m is even
        if ((m & 1) == 0) {
            ans += (freqArr[m / 2] * (freqArr[m / 2] - 1)) / 2;
        }
        int i = 1, j = m - 1;
        while (i < j) {
            ans += freqArr[i] * freqArr[j];
            i++;
            j--;
        }
        return ans % 1000000007;
    }

    static int solve2(int[] a, int k) {
        int n = a.length;
        long mod = (long) (1e9 + 7);
        long cnt[] = new long[k];
        // cnt[i] stores the count of elements such that their modulo k equals i
        for (int x : a) cnt[x % k]++;
        long ans = cnt[0] * (cnt[0] - 1) / 2;
        for (int i = 1, j = k - 1; i <= j; i++, j--) {
            if (i == j)
                ans = (ans + cnt[i] * (cnt[i] - 1) / 2) % mod;
            else
                ans = (ans + cnt[i] * cnt[j]) % mod;
        }
        return (int) ans;
    }

    static int solve(int[] A, int m) {
        int n = A.length;
        int[] freq = new int[m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int val = A[i] % m;
            int pair;
            if (val == 0) {
                pair = 0;
            } else {
                pair = m - val;
            }
            ans += freq[pair];
            freq[val]++;
        }
        return (ans) % 1000000007;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 2;
        int result = solve(A, B);
        System.out.println(result);
    }
}
