package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem144PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        preOrderTraversal(root,resultList);
        return resultList;
    }

    private void preOrderTraversal(TreeNode treeNode, List<Integer> resultList){
        if(treeNode == null)
            return;
        resultList.add(treeNode.val);
        preOrderTraversal(treeNode.left, resultList);
        preOrderTraversal(treeNode.right, resultList);
    }
}
