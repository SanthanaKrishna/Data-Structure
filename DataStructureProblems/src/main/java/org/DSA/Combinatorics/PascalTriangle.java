package org.DSA.Combinatorics;

public class PascalTriangle {

    public static void generatePascal(int N) {
        int[][] pascal = new int[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        System.out.println("Pascal Triangle for " + (N + 1) + " rows: ");
        for (int i = 0; i <= N; i++) {
            for (int space = 0; space < N - 1; space++) {// Print spaces for formatting
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {// Print the elements in the current row
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generatePascal(N);
    }
}
