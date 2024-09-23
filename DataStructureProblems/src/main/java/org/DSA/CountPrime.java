package org.DSA;

public class CountPrime {
    static int factor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num=127;
        int result=0;
        for (int i = 1; i <= num; i++) {
            if (factor(i) == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
