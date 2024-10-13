package org.DSA.Strings;

/**
 * You are given a string A of size N.
 * Return the string A after reversing the string word by word.
 * NOTE:
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 * Input 1: A = "the sky is blue"   Output 1: "blue is sky the"
 * Input 2: A = "this is ib"   Output 2: "ib is this"
 * Explanation 1:
 * We reverse the string word by word so the string becomes "blue is sky the".
 * Explanation 2:
 * We reverse the string word by word so the string becomes "ib is this".
 */
public class ReverseLine {
    static String reverseString(String str) {
        String[] words = str.trim().split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0)
                reversed.append(" ");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String result = reverseString("the sky is blue");
        System.out.println(result);
    }
}
