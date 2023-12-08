package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.ListNode;
import com.bimurto.leetcodesolutions.common.TreeNode;

public class CommonUtils {

    public static TreeNode prepareTreeNode(Integer[] treeArray) {
        TreeNode root = createTreeNode(treeArray, 0);;
        prepareTreeNode(root, treeArray, 0);
        return root;
    }

    public static void prepareTreeNode(TreeNode root, Integer[] treeArray, int index) {

        if (index >= treeArray.length)
            return;
        if(root == null)
            return;

        root.left = createTreeNode(treeArray,2 * index + 1);
        root.right = createTreeNode(treeArray,2 * index + 2);

        prepareTreeNode(root.left, treeArray, 2 * index + 1);
        prepareTreeNode(root.right, treeArray, 2 * index + 2);
    }

    public static TreeNode createTreeNode(Integer[] treeArray, int index) {
        if(index >= treeArray.length)
            return null;
        if (treeArray[index] == null)
            return null;
        else return new TreeNode(treeArray[index]);
    }

    public static  ListNode arrayToListNode(int[] array) {
        ListNode result = new ListNode(array[0]);
        ListNode start = result;
        for (int i = 1; i < array.length; i++) {
            start.next = new ListNode(array[i]);
            start = start.next;
        }
        return result;
    }

    public static  boolean validateListNoteWithArray(ListNode listNode, int[] result) {
        if(listNode == null && result.length ==0)
            return true;

        int index = 0;
        while (listNode != null) {
            if (listNode.val != result[index])
                return false;
            listNode = listNode.next;
            index++;
        }

        if (index != result.length)
            return false;
        return true;
    }
}
