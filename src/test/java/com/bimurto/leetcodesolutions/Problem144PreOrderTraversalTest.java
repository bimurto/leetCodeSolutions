package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem144PreOrderTraversalTest {
    @Test
    public void test1() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1,null,2,null,null,null,3});
        List<Integer> result = new Problem144PreOrderTraversal().preorderTraversal(treeNode);
        Assert.assertEquals(true, matchResult(Arrays.asList(1,2,3), result ));
    }

    @Test
    public void test2() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1,2,3,4,5,6,7});
        List<Integer> result = new Problem144PreOrderTraversal().preorderTraversal(treeNode);
        Assert.assertEquals(true, matchResult(Arrays.asList(1,2,4,5,3,6,7), result ));
    }

    @Test
    public void test3() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{1});
        List<Integer> result = new Problem144PreOrderTraversal().preorderTraversal(treeNode);
        Assert.assertEquals(true, matchResult(Arrays.asList(1), result ));
    }

    @Test
    public void test4() {
        TreeNode treeNode = prepareTreeNode(new Integer[]{});
        List<Integer> result = new Problem144PreOrderTraversal().preorderTraversal(treeNode);
        Assert.assertEquals(true, matchResult(new ArrayList<>(), result ));
    }

    private boolean matchResult(List<Integer> expected, List<Integer> result){
        if(expected.size() != result.size())
            return false;
        for (int i = 0; i < expected.size(); i++) {
            if(expected.get(i) != result.get(i))
                return false;
        }
        return true;
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
