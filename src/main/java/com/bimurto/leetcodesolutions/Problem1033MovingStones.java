package com.bimurto.leetcodesolutions;

import java.util.Arrays;

public class Problem1033MovingStones {
    public int[] numMovesStones(int a, int b, int c) {

        int[] input = {a,b,c};
        Arrays.sort(input);

        int high=input[2];
        int mid=input[1];
        int low=input[0];

        int[] result = new int[2];
        if(high-mid==2 || mid-low==2){
            result[0] = 1;
        }else {
            result[0] = ((high - mid) > 1 ? 1 : 0) + ((mid - low) > 1 ? 1 : 0);
        }
        result[1] = ((high - mid) - 1) + ((mid - low) - 1);
        return result;
    }
}
