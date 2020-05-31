package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Problem1033MovingStonesTest {

    @Test
    public void test1() {
        int a = 1;
        int b = 2;
        int c = 5;
        int[] expectedResult = {1,2};
        testAndAssert(a, b, c, expectedResult);
    }

    @Test
    public void test2() {
        int a = 4;
        int b = 3;
        int c = 2;
        int[] expectedResult = {0,0};
        testAndAssert(a, b, c, expectedResult);
    }

    @Test
    public void test3() {
        int a = 3;
        int b = 5;
        int c = 1;
        int[] expectedResult = {1,2};
        testAndAssert(a, b, c, expectedResult);
    }

    private void testAndAssert(int a, int b, int c, int[] expectedResult) {
        Problem1033MovingStones solution = new Problem1033MovingStones();
        int[] actualResult = solution.numMovesStones(a, b, c);
        Arrays.toString(actualResult);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}

