package com.bimurto.leetcodesolutions.educative.treedfs;

import com.bimurto.leetcodesolutions.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem543DiameterOfABinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        var result = diameterOfBinaryTreeInternal(root);
        return 0;
    }


    public List<Integer> diameterOfBinaryTreeInternal(TreeNode root) {
        if (root == null) return List.of(0, 0);

        var leftResult = diameterOfBinaryTreeInternal(root.left);
        var rightResult = diameterOfBinaryTreeInternal(root.right);
        var height = 1 + Math.max(leftResult.get(0), rightResult.get(0));
        var diameter = leftResult.get(0) + rightResult.get(0);
        var maxDiameter = Math.max(diameter, Math.max(leftResult.get(1), rightResult.get(1)));
        return List.of(height, maxDiameter);
    }
}
