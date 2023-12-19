package com.bimurto.leetcodesolutions.educative.twopointers;

public class Problem125ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        var start = 0;
        var end = s.length() - 1;
        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start)) && start < end) {
                start++;
            }

            while (!Character.isLetterOrDigit(s.charAt(end)) && start < end) {
                end--;
            }

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
