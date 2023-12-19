package com.bimurto.leetcodesolutions.educative.twopointers;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Problem151ReverseWordInAString {
    public String reverseWords(String s) {
        var stringList = Arrays.stream(s.trim().split(" ")).filter(it -> !it.isBlank()).collect(Collectors.toList());
        Collections.reverse(stringList);
        return String.join(" ", stringList);
    }
}
