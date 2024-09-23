package org.DSA;

public class Factors {
    static int countFactor(int A) {
        int count = 2;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                if (A / i == i) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int A = 10;
        int result = countFactor(A);
        System.out.println(result);
    }
}
