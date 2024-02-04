package com.bimurto.leetcodesolutions.educative.slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class Problem424LongestRepeatingCharacterReplacementTest {

    @Test
    public void test1() {
//        Assert.assertEquals(4, new Problem424LongestRepeatingCharacterReplacement().characterReplacement("ABAB", 2));
        Assert.assertEquals(4, new Problem424LongestRepeatingCharacterReplacement().characterReplacement("AABABBA", 1));
    }
}
