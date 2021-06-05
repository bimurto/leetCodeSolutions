package com.bimurto.leetcodesolutions;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Problem1276NoBurgersWithNoWasteTest {

    private <T> void assertListEquals(String msg, List<T> expected, List<T> actual){
        if(expected.size() != actual.size()){
            throw new AssertionFailedError(msg + " Size does not match. Expected : " + expected.size() + " Actual : " +
                    actual.size());
        }
        for (int i = 0; i < expected.size(); i++) {
            if(!expected.get(i).equals(actual.get(i)))
                throw new AssertionFailedError(msg + " Item mismatch. Index " + i+ " . Expected: " + expected.get(i) + "." +
                        "Actual: " + actual.get(i));
        }
    }

    @Test
    public void test1_sample1() {
        int tomatoSlices = 16;
        int cheeseSlices = 7;
        List<Integer> result = Arrays.asList(1,6);
        Problem1276NoBurgersWithNoWaste solution = new Problem1276NoBurgersWithNoWaste();
        assertListEquals("", result, solution.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    public void test1_sample2() {
        int tomatoSlices = 17;
        int cheeseSlices = 4;
        List<Integer> result = Arrays.asList();
        Problem1276NoBurgersWithNoWaste solution = new Problem1276NoBurgersWithNoWaste();
        assertListEquals("", result, solution.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    public void test1_sample3() {
        int tomatoSlices = 4;
        int cheeseSlices = 17;
        List<Integer> result = Arrays.asList();
        Problem1276NoBurgersWithNoWaste solution = new Problem1276NoBurgersWithNoWaste();
        assertListEquals("", result, solution.numOfBurgers(tomatoSlices, cheeseSlices));
    }

    @Test
    public void test1_sample4() {
        int tomatoSlices = 0;
        int cheeseSlices = 0;
        List<Integer> result = Arrays.asList(0,0);
        Problem1276NoBurgersWithNoWaste solution = new Problem1276NoBurgersWithNoWaste();
        assertListEquals("", result, solution.numOfBurgers(tomatoSlices, cheeseSlices));
    }


}
