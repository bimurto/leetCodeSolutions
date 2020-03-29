package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem958CompletenessOfBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null)
            return true;

        List<TreeNode> queue = new ArrayList<>();
        int index = 0;

        queue.add(root);
        boolean nullFound = false;
        boolean isCompleteTree = true;
        while (index < queue.size()) {
            TreeNode treeNode = queue.get(index);
            if (treeNode == null) {
                nullFound = true;
                index++;
                continue;
            }
            else if(nullFound){
                return false;
            }else {
                queue.add(treeNode.left);
                queue.add(treeNode.right);
                index++;
            }
        }
        return isCompleteTree;
    }
}



 
