package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

import com.bimurto.leetcodesolutions.common.ListNode;

import java.util.Stack;

public class Problem234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        var reversed = reverse(head);
        var node = head;
        while (node != null) {
            if (node.val != reversed.val) return false;
            node = node.next;
            reversed = reversed.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        var stack = new Stack<Integer>();
        var node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        var result = new ListNode(stack.pop());
        node = result;
        while (!stack.empty()) {
            var newNode = new ListNode(stack.pop());
            node.next = newNode;
            node = node.next;
        }
        return result;
    }
}
