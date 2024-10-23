package org.DSA.Hashing;

import java.util.HashSet;

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
