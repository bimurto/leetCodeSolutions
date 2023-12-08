package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static com.bimurto.leetcodesolutions.CommonUtils.prepareTreeNode;

public class Problem958CompletenessOfBinaryTreeTest {

    @Test
    public void should_return_true_when_valid_case() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1,2,3,4,5,6,7});
        Assert.assertEquals(true, new Problem958CompletenessOfBinaryTree().isCompleteTree(treeNode));
    }

    @Test
    public void should_return_true_when_valid_case_2() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1});
        Assert.assertEquals(true, new Problem958CompletenessOfBinaryTree().isCompleteTree(treeNode));
    }

    @Test
    public void should_return_true_when_valid_case_3() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{});
        Assert.assertEquals(true, new Problem958CompletenessOfBinaryTree().isCompleteTree(treeNode));
    }

    @Test
    public void should_return_false_when_valid_case() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1,2,3,4,5,null,7});
        Assert.assertEquals(false, new Problem958CompletenessOfBinaryTree().isCompleteTree(treeNode));
    }

    @Test
    public void should_return_false_when_valid_case_2() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1,null,3,null,null,null,7});
        Assert.assertEquals(false, new Problem958CompletenessOfBinaryTree().isCompleteTree(treeNode));
    }


}
