package com.bimurto.leetcodesolutions.educative.twopointers;

import org.junit.Test;

public class Problem75SortColorsTest {

    Problem75SortColors t = new Problem75SortColors();

    @Test
    public void test1(){
//        t.sortColors(new int[]{2,0,2,1,1,0});
        t.sortColorsV2(new int[]{2,0,2,1,1,0});
        t.sortColorsV2(new int[]{0,0,0});
        t.sortColorsV2(new int[]{1,0,2});
    }
}
