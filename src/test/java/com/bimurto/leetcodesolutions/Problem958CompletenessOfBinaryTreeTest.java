package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

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

    private TreeNode prepareTreeNode(Integer[] treeArray) {
        TreeNode root = createTreeNode(treeArray, 0);;
        prepareTreeNode(root, treeArray, 0);
        return root;
    }

    private void prepareTreeNode(TreeNode root, Integer[] treeArray, int index) {

        if (index >= treeArray.length)
            return;
        if(root == null)
            return;

        root.left = createTreeNode(treeArray,2 * index + 1);
        root.right = createTreeNode(treeArray,2 * index + 2);

        prepareTreeNode(root.left, treeArray, 2 * index + 1);
        prepareTreeNode(root.right, treeArray, 2 * index + 2);
    }

    private TreeNode createTreeNode(Integer[] treeArray, int index) {
        if(index >= treeArray.length)
            return null;
        if (treeArray[index] == null)
            return null;
        else return new TreeNode(treeArray[index]);
    }
}
