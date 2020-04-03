package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem475HeatersTest {
    @Test
    public void test1() {
        int[] houses = new int[]{1,2,3};
        int[] heaters = new int[]{2};
        Assert.assertEquals(1, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test2() {
        int[] houses = new int[]{1,2,3,4};
        int[] heaters = new int[]{1,4};
        Assert.assertEquals(1, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test3() {
        int[] houses = new int[]{1,2,3,4,5,6,7,8,9};
        int[] heaters = new int[]{5};
        Assert.assertEquals(4, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test4() {
        int[] houses = new int[]{1,2,3,4,5,6,7,8,9};
        int[] heaters = new int[]{50};
        Assert.assertEquals(49, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test5() {
        int[] houses = new int[]{1};
        int[] heaters = new int[]{1};
        Assert.assertEquals(0, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test6() {
        int[] houses = new int[]{1,2,3};
        int[] heaters = new int[]{1,2,3};
        Assert.assertEquals(0, new Problem475Heaters().findRadius(houses, heaters));
    }


    @Test
    public void test7() {
        int[] houses = new int[]{5};
        int[] heaters = new int[]{1,10};
        Assert.assertEquals(4, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test8() {
        int[] houses = new int[]{50,51,52};
        int[] heaters = new int[]{1,10,100};
        Assert.assertEquals(42, new Problem475Heaters().findRadius(houses, heaters));
    }

    @Test
    public void test9() {
        int[] houses = new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
        int[] heaters = new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
        Assert.assertEquals(161834419, new Problem475Heaters().findRadius(houses, heaters));
    }
}
