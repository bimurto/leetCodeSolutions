package com.bimurto.leetcodesolutions;

public class Problem1365HowManyNumbersSmallerThanCurrent {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int countArray[] = new int[101];
        for(int elem: nums){
            countArray[elem]++;
        }
        int  sumArray[] = new int[101];

        for(int i=1;i<101;i++){
            sumArray[i] = (sumArray[i-1] + countArray[i-1]);
        }

        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sumArray[nums[i]];
        }
        return result;
    }
}
