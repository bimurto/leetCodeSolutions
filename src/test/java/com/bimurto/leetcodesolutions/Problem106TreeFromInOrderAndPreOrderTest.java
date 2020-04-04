package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;
import org.junit.Test;

public class Problem106TreeFromInOrderAndPreOrderTest {

    @Test
    public void test1(){
        int[] inOrder = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] postOrder = {8, 4, 5, 2, 6, 7, 3, 1} ;
        TreeNode treeNode = new Problem106TreeFromInOrderAndPreOrder().buildTree(inOrder,postOrder);
        System.out.println(treeNode);
    }

    @Test
    public void test2(){
        int[] inOrder = {9,3,15,20,7};
        int[] postOrder = {9,15,7,20,3};
        TreeNode treeNode = new Problem106TreeFromInOrderAndPreOrder().buildTree(inOrder,postOrder);
        System.out.println(treeNode);
    }

    @Test
    public void test3(){
        int[] inOrder = {2,1,3};
        int[] postOrder = {2,3,1};
        TreeNode treeNode = new Problem106TreeFromInOrderAndPreOrder().buildTree(inOrder,postOrder);
        System.out.println(treeNode);
    }
}
