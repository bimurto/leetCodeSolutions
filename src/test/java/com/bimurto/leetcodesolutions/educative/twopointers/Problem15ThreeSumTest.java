package com.bimurto.leetcodesolutions.educative.twopointers;

import org.junit.Test;

public class Problem15ThreeSumTest {

    @Test
    public void test() {
        var obj = new Problem15ThreeSum();
        System.out.println(obj.threeSum(new int[]{0, 0, 0}));
        System.out.println(obj.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
