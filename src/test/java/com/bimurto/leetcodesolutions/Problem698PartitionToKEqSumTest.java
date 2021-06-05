package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem698PartitionToKEqSumTest {
    @Test
    public void test1_sample1() {
        int [] nums = new int[]{1,4,3,2,3,5,2,1};
        int k = 3;
        boolean result = true;
        Problem698PartitionToKEqSum solution = new Problem698PartitionToKEqSum();
        Assert.assertEquals(result, solution.canPartitionKSubsets(nums,k));
    }
    @Test
    public void test1_sample3() {
        int [] nums = new int[]{1,1,1,1,2,2,2,2,2};
        int k = 2;
        boolean result = true;
        Problem698PartitionToKEqSum solution = new Problem698PartitionToKEqSum();
        Assert.assertEquals(result, solution.canPartitionKSubsets(nums,k));
    }

    @Test
    public void test1_sample2() {
        int [] nums = new int[]{1,2,3,4};
        int k = 3;
        boolean result = false;
        Problem698PartitionToKEqSum solution = new Problem698PartitionToKEqSum();
        Assert.assertEquals(result, solution.canPartitionKSubsets(nums,k));
    }

    @Test
    public void test1_sample4() {
        int [] nums = new int[]{3522,181,521,515,304,123,2512,312,922,407,146,1932,4037,2646,3871,269};
        int k = 5;
        boolean result = false;
        Problem698PartitionToKEqSum solution = new Problem698PartitionToKEqSum();
        Assert.assertEquals(result, solution.canPartitionKSubsets(nums,k));
    }
}
