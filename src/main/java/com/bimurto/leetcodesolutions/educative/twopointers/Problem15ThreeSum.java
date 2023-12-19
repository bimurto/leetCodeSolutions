package com.bimurto.leetcodesolutions.educative.twopointers;

import java.util.*;

public class Problem15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++count);
        }


        int start = 0;
        var end = nums.length - 1;
        while (start < end) {
            var sum = nums[start] + nums[end];
            var count = map.getOrDefault(-sum, 0);
            if(count != 0){
                map.put(-sum, --count);
            }
        }

        return result;
    }
}
