package com.bimurto.leetcodesolutions.educative.slidingwindow;

public class Problem424LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        var sum = 0;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ((int) 'A' + i);
            sum = Math.max(sum, characterReplacementInternal(s, k, ch));
        }
        return sum;
    }

    public int characterReplacementInternal(String s, int k, char ch) {
        var start = 0;
        var end = 0;
        var count = 0;
        var sum = 0;
        while (end < s.length()) {
            if (s.charAt(end) != ch) {
                count++;
            }
            if (count == k) {
                end++;
                while (end < s.length() && s.charAt(end) == ch) {
                    end++;
                }
                sum = Math.max(sum, end - start);
                start++;
                while (start < s.length() && s.charAt(start) == ch) {
                    start++;
                }
                if (start < s.length() && s.charAt(start) != ch) {
                    count--;
                }
            }
            end++;
        }
        return sum;
    }
}
