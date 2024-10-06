package org.DSA.Strings;

/**
 * Given a string A, you are asked to reverse the string and return the reversed string.
 * Input 1: A = "scaler" Output 1: "relacs"
 * Input 2: A = "academy" Output 2: "ymedaca"
 */
public class StringReverse {
    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int i = 0, j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            j--;
            i++;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = reverseString("scaler");
        System.out.println(str);
    }
}
