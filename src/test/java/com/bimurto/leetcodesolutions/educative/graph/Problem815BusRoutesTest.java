package com.bimurto.leetcodesolutions.educative.graph;

import org.junit.Assert;
import org.junit.Test;

public class Problem815BusRoutesTest {

    @Test
    public void test1(){
        Assert.assertEquals(2, new Problem815BusRoutes().numBusesToDestination(new int[][]{
                {1,2,7},{3,6,7}
        }, 1, 6));
    }

    @Test
    public void test2(){
        Assert.assertEquals(2, new Problem815BusRoutes().numBusesToDestination(new int[][]{
                {7,12},{4,5,15},{6},{15,19},{9,12,13}
        }, 1, 6));
    }
}
