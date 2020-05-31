package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Problem31NextPermutationTest {

    @Test
    public void test1() {
        int[] nums = {1, 2, 9, 3, 6, 5, 4, 7};
        int[] result = {1, 2, 9, 3, 6, 5, 7, 4};
        test(nums, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3};
        int[] result = {1, 3, 2};
        test(nums, result);
    }

    @Test
    public void test3() {
        int[] nums = {3, 2, 1};
        int[] result = {1, 2, 3};
        test(nums, result);
    }

    @Test
    public void test4() {
        int[] nums = {1, 1, 5};
        int[] result = {1, 5, 1};
        test(nums, result);
    }

    @Test
    public void test5() {
        int[] nums = {1, 2, 9, 3, 6, 5, 7, 4};
        int[] result = {1, 2, 9, 3, 6, 7, 4, 5};
        test(nums, result);
    }

    @Test
    public void test6() {
        int[] nums = {1, 2, 9, 3, 6, 7, 5, 4};
        int[] result = {1, 2, 9, 3, 7, 4, 5, 6};
        test(nums, result);
    }

    @Test
    public void test7() {
        int[] nums = {};
        int[] result = {};
        test(nums, result);
    }

    @Test
    public void test8() {
        int[] nums = {1};
        int[] result = {1};
        test(nums, result);
    }

    @Test
    public void test9() {
        int[] nums = {1, 4, 3, 2};
        int[] result = {2, 1, 3, 4};
        test(nums, result);
    }

    @Test
    public void test10() {
        int[] nums = {3, 9, 2, 1};
        int[] result = {9, 1, 2, 3};
        test(nums, result);
    }

    @Test
    public void test11() {
        int[] nums = {1,5,1};
        int[] result = {5,1,1};
        test(nums, result);
    }

    @Test
    public void test12() {
        int[] nums = {5,4,7,5,3,2};
        int[] result = {5,5,2,3,4,7};
        test(nums, result);
    }

    private void test(int[] nums, int[] result) {
        Problem31NextPermutation solution = new Problem31NextPermutation();
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        Assert.assertArrayEquals(result, nums);
    }
}
