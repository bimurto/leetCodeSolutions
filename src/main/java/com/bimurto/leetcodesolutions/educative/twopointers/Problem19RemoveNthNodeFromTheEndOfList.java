package com.bimurto.leetcodesolutions.educative.twopointers;

import com.bimurto.leetcodesolutions.common.ListNode;

public class Problem19RemoveNthNodeFromTheEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        var parent = new ListNode(-1);
        parent.next = head;
        removeNthNodeInternal(head, parent, n);
        return parent.next;
    }

    private int removeNthNodeInternal(ListNode node, ListNode parent, int n) {
        if (node == null) return 0;
        var result = 1 + removeNthNodeInternal(node.next, node, n);
        if (result == n) {
            parent.next = node.next;
        }
        return result;
    }
}
