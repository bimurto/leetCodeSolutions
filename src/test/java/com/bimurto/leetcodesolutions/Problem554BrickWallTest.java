package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem554BrickWallTest {
    @Test
    public void test1_sample1() {
        List<List<Integer>> wall = Arrays.asList(
                Arrays.asList(1,2,2,1),
                Arrays.asList(3,1,2),
                Arrays.asList(1,3,2),
                Arrays.asList(2,4),
                Arrays.asList(3,1,2),
                Arrays.asList(1,3,1,1)
        );
        int result = 2;
        Problem554BrickWall solution = new Problem554BrickWall();
        Assert.assertEquals(result, solution.leastBricks(wall));
    }

    @Test
    public void test1_sample2() {
        List<List<Integer>> wall = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1),
                Arrays.asList(1)
        );
        int result = 3;
        Problem554BrickWall solution = new Problem554BrickWall();
        Assert.assertEquals(result, solution.leastBricks(wall));
    }
}
