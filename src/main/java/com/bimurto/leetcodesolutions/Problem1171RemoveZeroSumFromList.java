package com.bimurto.leetcodesolutions;

import com.bimurto.leetcodesolutions.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1171RemoveZeroSumFromList {
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> inputList = new ArrayList<>();

        ListNode start = head;
        while (start != null) {
            if(start.val != 0)
                inputList.add(start.val);
            start = start.next;
        }

        int[][] dp = new int[inputList.size()][inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            dp[i][i] = inputList.get(i);
        }

        List<Pair> resultList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i + 1; j < inputList.size(); j++) {
                dp[i][j] = dp[i][j - 1] + dp[j][j];
                if (dp[i][j] == 0) {
                    resultList.add(new Pair(i, j));
                    i = j + 1;
                }
            }
        }

        for (int i = resultList.size() - 1; i >= 0; i--) {
            Pair pair = resultList.get(i);
            for (int j = pair.endIndex; j >= pair.startIndex; j--) {
                inputList.remove(j);
            }
        }

        if(inputList.isEmpty())
            return null;
        ListNode result = new ListNode(inputList.get(0));
        ListNode itr = result;
        for (int i = 1; i < inputList.size(); i++) {
            itr.next = new ListNode(inputList.get(i));
            itr = itr.next;
        }

        return result;
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
