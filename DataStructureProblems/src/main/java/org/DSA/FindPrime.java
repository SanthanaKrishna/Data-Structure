package org.DSA;

public class FindPrime {

    static int isPrime(int num) {
        if (num == 1) return 0;
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(127));
    }
}
