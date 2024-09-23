package org.DSA;

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
