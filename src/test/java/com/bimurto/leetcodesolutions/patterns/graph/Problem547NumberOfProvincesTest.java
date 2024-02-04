package com.bimurto.leetcodesolutions.patterns.graph;

import org.junit.Test;

public class Problem547NumberOfProvincesTest {

    Problem547NumberOfProvinces solution = new Problem547NumberOfProvinces();

    @Test
    public void test1() {
//        var input = new int[][]{
//                {1, 1, 0},
//                {1, 1, 0},
//                {0, 0, 1}
//        };
//        Assert.assertEquals(2, solution.findCircleNum(input));
        new ClassA().doSomething();
        new ClassB().doSomethingElse();

    }
}

class ClassA {

    private static String jobID = "initial value";

    public void doSomething() {
        jobID = "1234";
        System.out.println("Class A running now: Job ID current value: " + jobID);
    }

    public static String getJobID() {
        return jobID;

    }
}

class ClassB {

    private static String jobID = "";

    public void doSomethingElse() {
        jobID = ClassA.getJobID();
        System.out.println("Class B running now: Job ID retrieved from Class A is: " + jobID);
    }
}