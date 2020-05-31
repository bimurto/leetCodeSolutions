package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem621TaskSchedulerTest {

    @Test
    public void test1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C'};
        int interval = 2;
        int result = 7;
        testAndAssert(tasks, interval, result);
    }

    @Test
    public void test2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int interval = 2;
        int result = 8;
        testAndAssert(tasks, interval, result);
    }

    @Test
    public void test3() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int interval = 0;
        int result = 6;
        testAndAssert(tasks, interval, result);
    }

    @Test
    public void test4() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int interval = 1;
        int result = 6;
        testAndAssert(tasks, interval, result);
    }

    @Test
    public void test5() {
        char[] tasks = {'A'};
        int interval = 1;
        int result = 1;
        testAndAssert(tasks, interval, result);
    }

    @Test
    public void test6(){
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C'};
        int interval = 4;
        int result = 11;
        testAndAssert(tasks, interval, result);
    }

    private void testAndAssert(char[] tasks, int interval, int expectedResult) {
        Problem621TaskScheduler solution = new Problem621TaskScheduler();
        int actualResult = solution.leastInterval(tasks, interval);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
