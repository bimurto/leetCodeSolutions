package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

import com.bimurto.leetcodesolutions.common.ListNode;

public class Problem876MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        var slowPointer = head;
        var fastPointer = head;
        while (true) {
            if (fastPointer.next == null) {
                return slowPointer;
            }
            if (fastPointer.next.next == null) {
                return slowPointer.next;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
    }
}
