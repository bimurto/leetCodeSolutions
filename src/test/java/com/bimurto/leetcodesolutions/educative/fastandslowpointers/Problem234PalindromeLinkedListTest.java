package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

import com.bimurto.leetcodesolutions.CommonUtils;
import org.junit.Test;

public class Problem234PalindromeLinkedListTest {

    Problem234PalindromeLinkedList testing = new Problem234PalindromeLinkedList();

    @Test
    public void test1() {
        testing.isPalindrome(CommonUtils.arrayToListNode(new int[]{1, 1, 2, 1}));
    }
}
