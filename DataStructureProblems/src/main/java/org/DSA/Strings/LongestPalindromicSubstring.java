package org.DSA.Strings;

/**
 * Given a string A of size N, find and return the longest palindromic substring in A.
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 * Input 1: A = "aaaabaaa"  Output 1: "aaabaaa"
 * Input 2: A = "abba Output 2: "abba"
 */
public class LongestPalindromicSubstring {

    static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length()) {
            if (str.charAt(left) == str.charAt(right)) {
                left--;
                right++;
            }
        }
        return right - left - 1;
    }

    static String findLongestPalindrome(String str) {
        if (str == null || str.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len1);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str;
    }

    public static void main(String[] args) {

    }
}
