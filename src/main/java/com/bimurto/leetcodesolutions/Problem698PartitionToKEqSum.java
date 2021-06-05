package com.bimurto.leetcodesolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Problem698PartitionToKEqSum {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        nums = Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        if (sum % k != 0)
            return false;
        int subsetSum = sum / k;
        int[] selected = new int[nums.length];
        int subsetCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (selected[i] != 0) {
                continue;
            }
            selected[i] = 1;
            int tempSum = nums[i];
            if (tempSum == subsetSum) {
                subsetCount++;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (selected[j] == 0 && tempSum + nums[j] <= subsetSum) {
                    selected[j] = 1;
                    tempSum = tempSum + nums[j];
                    if (tempSum == subsetSum) {
                        subsetCount++;
                        break;
                    }
                }
            }
        }
        if (subsetCount == k)
            return true;
        return false;
    }
}
