package com.bimurto.leetcodesolutions.educative.graph;

import com.bimurto.leetcodesolutions.common.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem133CloneGraphTest {
    public Node cloneGraph(Node node) {
        var nodeMap = new HashMap<Integer, Node>();
        if(node == null) return null;
        return cloneNode(node, nodeMap);
    }

    private Node cloneNode(Node node, HashMap<Integer, Node> nodeMap){
        if(nodeMap.containsKey(node.val)){
            return nodeMap.get(node.val);
        }

        var newNeighbors = new ArrayList<Node>();
        var newNode = new Node(node.val, newNeighbors);
        nodeMap.put(newNode.val, newNode);

        for (Node neighbor : node.neighbors) {
            newNeighbors.add(cloneNode(neighbor, nodeMap));
        }

        return newNode;
    }
}
