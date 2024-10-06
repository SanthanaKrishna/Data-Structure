package org.DSA.Strings;

/**
 * You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
 * You have to toggle case of each character of string A.
 * For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 * Input 1: A = "Hello"  Output 1: hELLO
 * Input 2: A = "tHiSiSaStRiNg" Output 2: ThIsIsAsTrInG
 */
public class StringToggle {

    static String convertUpperLower(String chr) {
        char[] arr = chr.toCharArray();
        for (int i = 0; i < chr.length(); i++) {
            char ch = arr[i];
            if (ch >= 'A' && ch <= 'Z') {
                arr[i] = (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                arr[i] = (char) (ch - 32);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String ch = "HelLO";
        String result = convertUpperLower(ch);
        System.out.println(result);
    }
}
