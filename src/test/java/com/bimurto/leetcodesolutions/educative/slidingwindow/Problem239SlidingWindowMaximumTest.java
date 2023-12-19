package com.bimurto.leetcodesolutions.educative.slidingwindow;

import org.junit.Test;

import java.util.Arrays;

public class Problem239SlidingWindowMaximumTest {

    Problem239SlidingWindowMaximum tested = new Problem239SlidingWindowMaximum();

    @Test
    public void test1(){
        System.out.println(Arrays.toString(tested.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));

//        tested.printMax(new int[]{1,3,-1,-3,5,3,6,7}, 8,3);
    }
}
