package org.DSA;

import java.util.Arrays;

public class SubArrayInRange {
    static int[] subArray(int[] A, int B, int C) {
        int[] result = new int[C - B + 1];
        int index = 0;
        for (int i = B; i <= C; i++) {
            result[index] = A[i];
            index++;
        }
        return result;
    }

    //    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        for(int i = B ; i <= C ; i++){
//            ans.add(A.get(i));
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6};
        int B = 1, C = 3;
        int[] result = subArray(A, B, C);
        System.out.println(Arrays.toString(result));
    }
}
