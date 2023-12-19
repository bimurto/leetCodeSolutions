package com.bimurto.leetcodesolutions.educative.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem187RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) return new ArrayList<>();
        var set = new HashSet<String>();
        var result = new HashSet<String>();
        for (int i = 0; i <= s.length() - 10; i++) {
            var substring = s.substring(i, i + 10);
            if (set.contains(substring)) {
                result.add(substring);
            } else {
                set.add(substring);
            }
        }
        return result.stream().toList();
    }
}
