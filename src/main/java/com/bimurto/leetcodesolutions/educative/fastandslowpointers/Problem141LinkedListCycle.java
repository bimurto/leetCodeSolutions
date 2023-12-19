package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

import com.bimurto.leetcodesolutions.common.ListNode;

public class Problem141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        var slowPointer = head;
        var fastPointer = head.next;
        while (true) {
            if (slowPointer == null) return false;
            if (slowPointer == fastPointer) return true;
            slowPointer = slowPointer.next;
            if (fastPointer == null || fastPointer.next == null) return false;
            else fastPointer = fastPointer.next.next;
        }
    }
}
