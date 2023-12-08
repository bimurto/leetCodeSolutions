package com.bimurto.leetcodesolutions.educative.graph;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

public class Problem815BusRoutes {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        var graph = new HashMap<Integer, HashSet<Integer>>();
        for (int i = 0; i < routes.length; i++) {
            int[] route = routes[i];
            for (int stop : route) {
                var set = graph.getOrDefault(stop,  new HashSet<>());
                set.add(i);
                graph.put(stop, set);
            }
        }

        var visited = new HashSet<Integer>();
        var queue = new ArrayDeque<Integer>();
        var result = 0;
        queue.add(source);

        while(!queue.isEmpty()){
            var stop = queue.poll();
            var localRoutes = graph.get(stop);
            for (Integer routeIndex : localRoutes) {
                if(visited.contains(routeIndex)) continue;
                var route = routes[routeIndex];
                for (int j : route) {
                    if (j == target) return ++result;
                }
                visited.add(routeIndex);
            }
        }
        return 0;
    }
}
