package com.bimurto.leetcodesolutions.educative.graph;

import org.junit.Assert;
import org.junit.Test;

public class Problem261GraphValidTreeTest {

    @Test
    public void test1(){
        Assert.assertTrue(new Problem261GraphValidTree().validTree(5, new int[][]{
                {0, 1}, {0, 2}, {0, 3}, {1, 4}
        }));
    }

    @Test
    public void test2(){
        Assert.assertFalse(new Problem261GraphValidTree().validTree(5, new int[][]{
                {0,1},{1,2},{2,3},{1,3},{1,4}
        }));
    }

    @Test
    public void test3(){
        Assert.assertTrue(new Problem261GraphValidTree().validTree(1, new int[][]{}));
    }
}
