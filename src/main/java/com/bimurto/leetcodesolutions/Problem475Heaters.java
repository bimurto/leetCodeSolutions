package com.bimurto.leetcodesolutions;

import java.util.Arrays;

public class Problem475Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int max = 0;
        int heaterIndex = 0;
        int houseIndex = 0;

        Arrays.sort(houses);
        Arrays.sort(heaters);

        while (houseIndex < houses.length) {
            int housePosition = houses[houseIndex];
            int heaterPosition = heaters[heaterIndex];
            while (heaterPosition < housePosition && heaterIndex + 1 < heaters.length) {
                heaterIndex++;
                heaterPosition = heaters[heaterIndex];
            }
            int left = Math.abs(housePosition - heaterPosition);
            int right = Integer.MAX_VALUE;
            if (heaterIndex != 0) {
                right = Math.abs(housePosition - heaters[heaterIndex - 1]);
            }

            max = Math.max(max, Math.min(left, right));

            houseIndex++;
        }

        return max;
    }
}
