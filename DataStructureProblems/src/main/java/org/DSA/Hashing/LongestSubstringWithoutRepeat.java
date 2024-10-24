package org.DSA.Hashing;

import java.util.HashSet;

/**
 * Longest Substring Without Repeat
 * Determine the "GOOD"ness of a given string A, where the "GOOD"ness is defined by the length of the longest substring that contains no repeating characters.
 * The greater the length of this unique-character substring, the higher the "GOOD"ness of the string.
 * Your task is to return an integer representing the "GOOD"ness of string A.
 * Note: The solution should be achieved in O(N) time complexity, where N is the length of the string.
 * Input 1: A = "abcabcbb"  Output 1: 3
 * Input 2: A = "AaaA"  Output 2: 2
 * Explanation 1: Substring "abc" is the longest substring without repeating characters in string A.
 * Explanation 2: Substring "Aa" or "aA" is the longest substring without repeating characters in string A.
 */
public class LongestSubstringWithoutRepeat {

    static int findSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, ans = 0;
        while (j < str.length()) {
            if (set.contains(str.charAt(j))) {
                set.remove(str.charAt(i));
                i++;
            } else {
                set.add(str.charAt(j));
                j++;
                ans = Math.max(ans, set.size());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "ijklmpkmabcrk";
        int result = findSubstring(str);
        System.out.println(result);
    }
}
