package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Problem1171RemoveZeroSumFromListV2 {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> hashMap = new HashMap<>();

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        hashMap.put(0,dummyHead);

        ListNode start = dummyHead.next;
        int sum = 0;
        while(start != null){
            sum += start.val;
            if(hashMap.containsKey(sum)){
                ListNode node1 = hashMap.get(sum);
                ListNode itr = node1;
                int newSum = sum;
                while(itr.next != start){
                    itr = itr.next;
                    newSum += itr.val;
                    hashMap.remove(newSum);
                }
                node1.next = start.next;
            }else {
                hashMap.put(sum, start);
            }

            start = start.next;
        }

        return dummyHead.next;
    }

    private class Pair {
        int startIndex;
        int endIndex;

        public Pair(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }
}
