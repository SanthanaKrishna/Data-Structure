package org.DSA;

public class PerfectNumber {
//    public static int solve(int A) {
//        int result = 0;
//        for (int i = 1; i*i < A; i++) {
//            if (A % i == 0) {
//                result += i;
//            }
//        }
//        if (result == A) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    public static int isPerfectNumber(int A) {
        int sum = 1;
        for (int i = 2; i<= A/2; i++) {
            if (A % i == 0) {
                sum = sum  + i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int result = isPerfectNumber(33550336);
        System.out.println(result);
    }
}
