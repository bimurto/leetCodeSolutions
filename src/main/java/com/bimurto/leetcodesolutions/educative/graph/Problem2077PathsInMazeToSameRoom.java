package com.bimurto.leetcodesolutions.educative.graph;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem2077PathsInMazeToSameRoom {
    public int numberOfPaths(int n, int[][] corridors) {
        var graph = new ArrayList<HashSet<Integer>>();
        for (int i = 0; i < n+1; i++) {
            graph.add(new HashSet<>());
        }
        var result = 0;
        for (int[] edge : corridors) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

            var sourceAdjacency = new HashSet<>(graph.get(edge[0]));
            var destAdjacency = new HashSet<>(graph.get(edge[1]));
            sourceAdjacency.retainAll(destAdjacency);

            result += sourceAdjacency.size();
        }
        return  result;
    }
}
