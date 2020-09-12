package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem1365HowManyNumbersSmallerThanCurrentTest {

    @Test
    public void test1_sample1() {
        int [] input = new int[]{0,0,100,100,100};
        int [] result = new int[]{0,0,2,2,2};
        Problem1365HowManyNumbersSmallerThanCurrent solution = new Problem1365HowManyNumbersSmallerThanCurrent();
        Assert.assertArrayEquals(result, solution.smallerNumbersThanCurrent(input));
    }

    @Test
    public void test2_sample2() {
        int [] input = new int[]{6,5,4,8};
        int [] result = new int[]{2,1,0,3};
        Problem1365HowManyNumbersSmallerThanCurrent solution = new Problem1365HowManyNumbersSmallerThanCurrent();
        Assert.assertArrayEquals(result, solution.smallerNumbersThanCurrent(input));
    }

    @Test
    public void test3_sample3() {
        int [] input = new int[]{7,7,7,7};
        int [] result = new int[]{0,0,0,0};
        Problem1365HowManyNumbersSmallerThanCurrent solution = new Problem1365HowManyNumbersSmallerThanCurrent();
        Assert.assertArrayEquals(result, solution.smallerNumbersThanCurrent(input));
    }
}
