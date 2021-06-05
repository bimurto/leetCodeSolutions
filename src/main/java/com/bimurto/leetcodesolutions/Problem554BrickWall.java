package com.bimurto.leetcodesolutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem554BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edgeFrequency = new HashMap<>();
        int maxEdgeCount = 0;
        for (List<Integer> rowOfBricks : wall) {
            int currentEdge = 0;
            for (int i = 0; i < rowOfBricks.size() -1; i++) {
                currentEdge += rowOfBricks.get(i);
                int currentEdgeFreq = edgeFrequency.getOrDefault(currentEdge,0);
                edgeFrequency.put(currentEdge,  currentEdgeFreq+1);
                maxEdgeCount = Math.max(maxEdgeCount, currentEdgeFreq+1);
            }
        }
        return wall.size() - maxEdgeCount;
    }
}
