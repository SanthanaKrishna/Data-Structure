package org.DSA;

/** Carry Forward & SubArrays - Special Subsequences "AG" - 2
 * You have given a string A having Uppercase English letters.
 * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
 *  Input 1: A = "ABCGAG" Output 1: 3  || Input 2: A = "GAB" Output 2: 0
 *  Explanation 1: Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5).
 *  Explanation 2: There is no subsequence "AG" in the given string.
 */

public class SpecialSubSequences {
    public static long findSubSequence(String A) {
        int n=A.length(), countA =0;
        long ans=0;
        for(int i=0; i<n; i++){
            if(A.charAt(i)== 'A'){
                countA++;
            }else if(A.charAt(i) == 'G'){
                ans= ans + countA;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String A = "ABCGAG";
        long result= findSubSequence(A);
        System.out.println(result);
    }
}
