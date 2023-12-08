package com.bimurto.leetcodesolutions.educative.treedfs;

import com.bimurto.leetcodesolutions.common.TreeNode;

import java.util.ArrayList;
import java.util.Objects;

public class Problem297SerializeAndDeserializeTree {

    public String serialize(TreeNode root) {
        var stringBuilder = new StringBuilder();
        preorder(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void preorder(TreeNode root, StringBuilder stringBuilder) {
        if (root == null) {
            stringBuilder.append("null,");
            return;
        }
        stringBuilder.append(root.val).append(",");
        preorder(root.left, stringBuilder);
        preorder(root.right, stringBuilder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        if (tokens.length == 0) return null;
        if (Objects.equals(tokens[0], "null")) return null;
        var value = Integer.parseInt(tokens[0]);
        var root = new TreeNode(value);
        prepareTreeNode(root, tokens, 0, 0);
        return root;
    }

    public void prepareTreeNode(TreeNode root, String[] tokens, Integer index, Integer child) {
        if (tokens.length <= index + 1) {
            return;
        }
        if (Objects.equals(tokens[index + 1], "null")) {
            if (child == 0) {
                root.left = null;
                prepareTreeNode(root, tokens, index + 1, 1);
            } else {
                root.right = null;
            }
            return;
        }

        var value = Integer.parseInt(tokens[index + 1]);
        if (child == 0) {
            root.left = new TreeNode(value);
        } else {
            root.right = new TreeNode(value);
        }

        prepareTreeNode(root.left, tokens, index + 1, 0);
        prepareTreeNode(root.right, tokens, index + 1, 1);
    }
}
