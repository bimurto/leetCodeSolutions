package com.bimurto.leetcodesolutions;

import java.util.Arrays;
import java.util.LinkedList;

public class Problem331VerifyPreOrderOfBinaryTree {
    public boolean isValidSerializationV1(String preorder) {
        String[] nodes = preorder.split(",");
        if (nodes.length == 1 && nodes[0].equals("#"))
            return true;
        if (nodes.length < 3)
            return false;
        LinkedList<String> inputList = new LinkedList<>(Arrays.asList(nodes));
        for (int i = nodes.length - 1; i >= 0; ) {
            if (i >= 2 && inputList.get(i).equals("#") && inputList.get(i - 1).equals("#") && !inputList.get(i - 2).equals("#")) {
                inputList.set(i - 2, "#");
                inputList.remove(i);
                inputList.remove(i - 1);
                i = i - 2;
            } else if (!inputList.get(i).equals("#")) {
                if (i + 2 < inputList.size()) {
                    if (inputList.get(i + 1).equals("#") && inputList.get(i + 2).equals("#")) {
                        inputList.set(i, "#");
                        inputList.remove(i + 2);
                        inputList.remove(i + 1);
                        i--;
                    }
                } else {
                    return false;
                }
            } else {
                i--;
            }
        }

        if (inputList.size() == 1 && inputList.get(0).equals("#"))
            return true;
        else return false;
    }

    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        if (nodes.length == 1 && nodes[0].equals("#"))
            return true;
        if (nodes.length < 3)
            return false;

        int inbound = 0;
        int outbound = 0;

        for (int i = 0; i < nodes.length; i++) {
            if(inbound-outbound<0)
                return false;

            if (nodes[i].equals("#")) {
                inbound++;
            } else {
                outbound += 2;
                if (i != 0) {
                    inbound++;
                }
            }
        }
        if (inbound == outbound)
            return true;
        return false;
    }

}
