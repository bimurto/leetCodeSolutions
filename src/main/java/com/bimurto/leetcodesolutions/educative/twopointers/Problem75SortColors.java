package com.bimurto.leetcodesolutions.educative.twopointers;

import java.util.Arrays;

public class Problem75SortColors {
    public void sortColors(int[] nums) {
        var count0 = 0;
        var count1 = 0;
        var count2 = 0;
        for (int num : nums) {
            if (num == 0) count0++;
            if (num == 1) count1++;
            if (num == 2) count2++;
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i] = 2;
        }
    }

    public void sortColorsV2(int[] nums) {
        var start = 0;
        var end = nums.length - 1;

        while (start <= end && nums[start] == 0) start++;
        while (start <= end && nums[end] == 2) end--;

        var i = start;

        while (i <= end && i < nums.length) {
            if (i > start && nums[0] == 0) {
                while (i > start && nums[start] == 0) start++;
                swap(nums, start, i);
                start++;
                i++;
            } else if (i < end && nums[i] == 2) {
                while (i < end && nums[end] == 2) end--;
                swap(nums, end, i);
                end--;
            } else i++;

        }

//        while (i < nums.length) {
//            if (nums[i] == 0) {
//                while (nums[start] != 0) {
//                    start++;
//                    i++;
//                }
//                if (start == i) {
//                    i++;
//                    start++;
//                } else if(start){
//                    swap(nums, start, i);
//                    start++;
//                }
//            } else if (nums[i] == 0) {
//
//            }

//        }

        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j) return;
        var temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
