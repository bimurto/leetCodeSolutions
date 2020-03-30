package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class Problem1171RemoveZeroSumFromListV2Test {

    @Test
    public void should_success_when_valid_input_1() {
        int [] input = new int[]{1,2,3,-3,1};
        int [] result = new int[]{1,2,1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_2() {
        int [] input = new int[]{1,2,3,-3,-2,-1,3,-3,2,1};
        int [] result = new int[]{2,1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_3() {
        int [] input = new int[]{1,-1};
        int [] result = new int[]{};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_4() {
        int [] input = new int[]{1};
        int [] result = new int[]{1};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_5() {
        int [] input = new int[]{0,0,0};
        int [] result = new int[]{};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    @Test
    public void should_success_when_valid_input_6() {
        int [] input = new int[]{2,0};
        int [] result = new int[]{2};
        ListNode resultListNode = new Problem1171RemoveZeroSumFromListV2().removeZeroSumSublists(arrayToListNode(input));
        Assert.assertEquals(true, validateListNoteWithArray(resultListNode, result));
    }

    private ListNode arrayToListNode(int[] array) {
        ListNode result = new ListNode(array[0]);
        ListNode start = result;
        for (int i = 1; i < array.length; i++) {
            start.next = new ListNode(array[i]);
            start = start.next;
        }
        return result;
    }

    private boolean validateListNoteWithArray(ListNode listNode, int[] result) {
        if(listNode == null && result.length ==0)
            return true;

        int index = 0;
        while (listNode != null) {
            if (listNode.val != result[index])
                return false;
            listNode = listNode.next;
            index++;
        }

        if (index != result.length)
            return false;
        return true;
    }
}
