package com.bimurto.leetcodesolutions;

import java.util.Arrays;

public class Problem31NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1)
            return;

        int sortStartIndex = 0;

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                int swapIndex = findSwapIndex(nums, i, nums[i-1]);
                swap(nums, swapIndex, i-1);
                sortStartIndex = i;
                break;
            }
        }

        Arrays.sort(nums, sortStartIndex, nums.length);
    }

    private void swap(int[] array, int indexX, int indexY) {
        int temp = array[indexX];
        array[indexX] = array[indexY];
        array[indexY] = temp;
    }

    private int findSwapIndex(int [] array, int start, int reference){
        int min = array[start];
        int minIndex = start;
        for (int i = start; i < array.length; i++) {
            if(array[i] <= reference)
                continue;
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {

    }
}
