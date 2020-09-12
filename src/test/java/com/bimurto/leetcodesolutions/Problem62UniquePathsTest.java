package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem62UniquePathsTest {

    @Test
    public void test1(){
        int m=7,n=3;
        int result = 28;
        Problem62UniquePaths solution = new Problem62UniquePaths();
        Assert.assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void test2(){
        int m=3,n=2;
        int result = 3;
        Problem62UniquePaths solution = new Problem62UniquePaths();
        Assert.assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void test3(){
        int m=1,n=1;
        int result = 1;
        Problem62UniquePaths solution = new Problem62UniquePaths();
        Assert.assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void test4(){
        int m=1,n=10;
        int result = 1;
        Problem62UniquePaths solution = new Problem62UniquePaths();
        Assert.assertEquals(result, solution.uniquePaths(m,n));
    }

    @Test
    public void test5(){
        int m=10,n=1;
        int result = 1;
        Problem62UniquePaths solution = new Problem62UniquePaths();
        Assert.assertEquals(result, solution.uniquePaths(m,n));
    }
}
