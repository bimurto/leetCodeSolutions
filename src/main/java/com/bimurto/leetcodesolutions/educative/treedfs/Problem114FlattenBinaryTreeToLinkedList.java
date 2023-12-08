package com.bimurto.leetcodesolutions.educative.treedfs;

import com.bimurto.leetcodesolutions.common.TreeNode;

public class Problem114FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        flattenInternal(root);
    }

    private void flattenInternal(TreeNode node) {
        if (node == null) return;
        if (node.left != null) {
            var current = node.left;
            while (current.right != null) {
                current = current.right;
            }
            current.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        flattenInternal(node.right);
    }
}
