package com.bimurto.leetcodesolutions.educative.treedfs;

import com.bimurto.leetcodesolutions.CommonUtils;
import org.junit.Test;

public class Problem114FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test1() {
        var root = CommonUtils.prepareTreeNode(new Integer[]{1, 2, 5, 3, 4, null, 6});
        new Problem114FlattenBinaryTreeToLinkedList().flatten(root);
        System.out.println(root.val);
    }
}
