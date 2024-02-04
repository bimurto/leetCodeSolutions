package com.bimurto.leetcodesolutions.patterns.graph;

public class Problem547NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        var visited = new boolean[isConnected.length];
        var provinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }
        return provinces;
    }

    private void dfs(int node, int[][] isConnected, boolean[] visited) {
        visited[node] = true;
        for (int j = 0; j < isConnected[node].length; j++) {
            if(j == node || visited[j] || isConnected[node][j] == 0) continue;
            dfs(j, isConnected, visited);
        }
    }
}
