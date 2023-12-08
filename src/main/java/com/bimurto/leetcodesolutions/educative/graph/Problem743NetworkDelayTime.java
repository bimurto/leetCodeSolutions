package com.bimurto.leetcodesolutions.educative.graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem743NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        var visited = new boolean[n+1];
        var dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        var adjacentMatrix = new int[n+1][n+1];
        for (int[] matrix : adjacentMatrix) {
            Arrays.fill(matrix, -1);
        }
        for (int[] edge : times) {
            var sourceVertex = edge[0];
            var destVertex = edge[1];
            var weight = edge[2];
            adjacentMatrix[sourceVertex][destVertex] = weight;
        }

        var result = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::dist));
        dist[k] = 0;
        pq.offer(new Node(k, 0));

        while(!pq.isEmpty()){
            var node = pq.poll();
            if(visited[node.node()]) continue;
            var adjacencyList = adjacentMatrix[node.node()];

            for (int i = 1; i < adjacencyList.length; i++) {
                if(!visited[i] && adjacencyList[i] != -1){
                    dist[i] = Math.min(dist[i],node.dist() + adjacencyList[i]);
                    pq.offer(new Node(i, dist[i]));
                }
            }
            visited[node.node()] = true;
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]) return -1;
        }

        for (int i = 1; i < dist.length; i++) {
            result = Math.max(result, dist[i]);
        }
        return result;
    }
    record Node(int node, int dist){}
}

