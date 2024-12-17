package org.DSA;

public class CountPrimesSieveEratosthenes {
    public static int countPrimes(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1]; // Array to mark prime numbers
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;// Assume all numbers are prime initially
        }
        // Sieve of Eratosthenes logic
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                //cut multiples of i
                for (int j = i * i; j <= n; j += i) { // Mark all multiples of p as non-prime
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 127; // Input number up to which primes are counted
        int result = countPrimes(num);
        System.out.println("Number of prime numbers up to " + num + " is: " + result);
    }
}
