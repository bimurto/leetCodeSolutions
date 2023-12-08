package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static com.bimurto.leetcodesolutions.CommonUtils.arrayToListNode;
import static com.bimurto.leetcodesolutions.CommonUtils.validateListNoteWithArray;

public class Problem1171RemoveZeroSumFromListTest {

    @Test
    public void should_success_when_valid_input_1() {
        int [] input = new int[]{1,2,3,-3,1};
        int [] result = new int[]{1,2,1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromList().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_2() {
        int [] input = new int[]{1,2,3,-3,-2,-1,3,-3,2,1};
        int [] result = new int[]{2,1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromList().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_3() {
        int [] input = new int[]{1,-1};
        int [] result = new int[]{};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromList().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_4() {
        int [] input = new int[]{1};
        int [] result = new int[]{1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromList().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_5() {
        int [] input = new int[]{0,0,0};
        int [] result = new int[]{};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromList().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }


}
