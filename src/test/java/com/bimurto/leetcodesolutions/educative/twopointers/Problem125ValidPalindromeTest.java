package com.bimurto.leetcodesolutions.educative.twopointers;

import org.junit.Assert;
import org.junit.Test;

public class Problem125ValidPalindromeTest {

    @Test
    public void test1() {
        Assert.assertTrue(new Problem125ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertTrue(new Problem125ValidPalindrome().isPalindrome(""));
        Assert.assertTrue(new Problem125ValidPalindrome().isPalindrome(" "));
        Assert.assertTrue(new Problem125ValidPalindrome().isPalindrome(" aa"));
        Assert.assertTrue(new Problem125ValidPalindrome().isPalindrome(" a"));
    }
}
