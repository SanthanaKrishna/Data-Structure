package org.DSA.Combinatorics;

public class ExcelColumnTitle {

    public static String getColumnTitle(int n) {
        StringBuilder columnTitle = new StringBuilder();

        while (n > 0) {
            int remainder = (n - 1) % 26;
            char letter = (char) (remainder + 'A');// Convert remainder to corresponding letter (A = 0, Z = 25)
            columnTitle.append(letter);
            n = (n - 1) / 26;// Reduce n for the next iteration
        }
        return columnTitle.toString();
    }

    public static void main(String[] args) {
        int n = 703; // Input column number
        String result = getColumnTitle(n);
        System.out.println("Column title for " + n + " is: " + result);
    }
}
