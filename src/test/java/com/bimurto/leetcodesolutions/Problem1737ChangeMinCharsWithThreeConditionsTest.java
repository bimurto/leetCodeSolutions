package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem1737ChangeMinCharsWithThreeConditionsTest {

    @Test
    public void test1_sample1() {
        String a = "aba";
        String b = "caa";
        int result = 2;
        Problem1737ChangeMinCharsWithThreeConditions solution = new Problem1737ChangeMinCharsWithThreeConditions();
        Assert.assertEquals(result, solution.minCharacters(a,b));
    }

    @Test
    public void test1_sample2() {
        String a = "dabadd";
        String b = "cda";
        int result = 3;
        Problem1737ChangeMinCharsWithThreeConditions solution = new Problem1737ChangeMinCharsWithThreeConditions();
        Assert.assertEquals(result, solution.minCharacters(a,b));
    }
}
