package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem106TreeFromInOrderAndPreOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i], i);
        }

        AtomicInteger index = new AtomicInteger(inorder.length - 1);
        return buildTree(inorder, postorder, 0, inorder.length - 1, index, inOrderIndexMap);
    }

    private TreeNode buildTree(int[] inorder, int[] postOrder, int start, int end, AtomicInteger index, Map<Integer, Integer> inOrderIndexMap) {

        if (start > end)
            return null;

        int rootValue = postOrder[index.getAndDecrement()];
        TreeNode root = new TreeNode(rootValue);

        if (start == end)
            return root;

        int inorderIndex = inOrderIndexMap.get(rootValue);

        root.right = buildTree(inorder, postOrder, inorderIndex + 1, end, index, inOrderIndexMap);
        root.left = buildTree(inorder, postOrder, start, inorderIndex - 1, index, inOrderIndexMap);

        return root;
    }
}
