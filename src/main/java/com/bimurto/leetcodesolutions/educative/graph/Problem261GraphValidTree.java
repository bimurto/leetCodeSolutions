package com.bimurto.leetcodesolutions.educative.graph;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem261GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        var graph = new ArrayList<HashSet<Integer>>(n);
        for (int i = 0; i < n; i++) {
            graph.add( new HashSet<>());
        }

        for (int[] edge : edges) {
            var source = edge[0];
            var dest = edge[1];
            graph.get(source).add(dest);
            graph.get(dest).add(source);
        }
        var visited = new boolean[n];

        var result =  dfs(graph, 0, -1, visited);
        for (boolean hasVisited : visited) {
            if(!hasVisited) return false;
        }
        return result;
    }

    public boolean dfs(ArrayList<HashSet<Integer>> graph, int current, int parent, boolean[] visited){
        if(visited[current]) return false;
        visited[current] = true;
        var adjacencyList = graph.get(current);
        for (Integer node : adjacencyList) {
            if(node == parent) continue;
            var tempResult = dfs(graph, node, current, visited);
            if(!tempResult) return false;
        }
        return true;
    }
}
