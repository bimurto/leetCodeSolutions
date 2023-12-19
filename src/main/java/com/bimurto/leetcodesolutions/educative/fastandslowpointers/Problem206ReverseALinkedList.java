package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

import com.bimurto.leetcodesolutions.common.ListNode;

public class Problem206ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        var parent = head;
        var current = head.next;
        if (current == null)
            return head;
        var next = current.next;
        current.next = parent;
        parent.next = null;
        while (next != null) {
            parent = current;
            current = next;
            next = current.next;
            current.next = parent;
        }
        return current;
    }
}
