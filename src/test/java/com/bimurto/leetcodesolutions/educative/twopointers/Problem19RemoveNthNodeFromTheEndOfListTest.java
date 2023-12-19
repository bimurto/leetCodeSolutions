package com.bimurto.leetcodesolutions.educative.twopointers;

import com.bimurto.leetcodesolutions.CommonUtils;
import org.junit.Test;

public class Problem19RemoveNthNodeFromTheEndOfListTest {

    Problem19RemoveNthNodeFromTheEndOfList t = new Problem19RemoveNthNodeFromTheEndOfList();

    @Test
    public void test1() {
//        t.removeNthFromEnd(CommonUtils.arrayToListNode(new int[]{1, 2, 3}), 2);
//        t.removeNthFromEnd(CommonUtils.arrayToListNode(new int[]{1, 2}), 2);
        t.removeNthFromEnd(CommonUtils.arrayToListNode(new int[]{1}), 1);
//        t.removeNthFromEnd(CommonUtils.arrayToListNode(new int[]{1, 2, 3}), 2);
    }
}
