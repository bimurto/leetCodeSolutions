package com.bimurto.leetcodesolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1276NoBurgersWithNoWaste {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int a = 4;
        int b = 2;
        int c = 1;
        int d = 1;

        int e = tomatoSlices;
        int f = cheeseSlices;

        List<Integer> emptyResult = new ArrayList<>();

        double x = (double) (d * e - b * f) / (a * d - b * c);
        double y = (double) (c * e - a * f) / (b * c - a * d);

        if (Math.floor(x) != x || Math.floor(y) != y || x < 0 || y < 0 )
            return emptyResult;

        return Arrays.asList((int) x, (int) y);
    }
}
