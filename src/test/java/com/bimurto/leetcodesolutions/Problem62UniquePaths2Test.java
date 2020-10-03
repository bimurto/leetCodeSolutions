package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem62UniquePaths2Test {

    @Test
    public void test1(){
        int input [][] = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        int result = 2;
        Problem63UniquePaths2 solution = new Problem63UniquePaths2();
        Assert.assertEquals(result, solution.uniquePathsWithObstacles(input));
    }

    @Test
    public void test2(){
        int input [][] = {
                {1}
        };
        int result = 0;
        Problem63UniquePaths2 solution = new Problem63UniquePaths2();
        Assert.assertEquals(result, solution.uniquePathsWithObstacles(input));
    }

    @Test
    public void test3(){
        int input [][] = {
                {1,0},
                {0,1}
        };
        int result = 0;
        Problem63UniquePaths2 solution = new Problem63UniquePaths2();
        Assert.assertEquals(result, solution.uniquePathsWithObstacles(input));
    }

    @Test
    public void test4(){
        int input [][] = {
                {0,1}
        };
        int result = 0;
        Problem63UniquePaths2 solution = new Problem63UniquePaths2();
        Assert.assertEquals(result, solution.uniquePathsWithObstacles(input));
    }

}
