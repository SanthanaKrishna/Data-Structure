package org.DSA;

public class FindPrime {

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }
        return count == 1;
    }

    ;

    public static void main(String[] args) {
        System.out.println(isPrime(127));
    }
}
