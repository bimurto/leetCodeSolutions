package com.bimurto.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class Problem1670FrontMiddleBackQueue {
    public static void main(String[] args) {
        FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
        obj.pushFront(1);
        obj.pushBack(2);
        obj.pushBack(3);
        obj.pushBack(4);
        obj.pushBack(5);
        obj.pushBack(6);
        obj.pushBack(7);
//        obj.pushMiddle(3);
//        obj.pushMiddle(4);
//        obj.pushMiddle(5);
//        obj.pushMiddle(6);
//        obj.pushMiddle(7);

//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());
//        System.out.println(obj.popMiddle());

//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());
//        System.out.println(obj.popBack());

        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());
        System.out.println(obj.popFront());

    }
}

class FrontMiddleBackQueue {

    List<Integer> queue;

    public FrontMiddleBackQueue() {
        queue = new ArrayList<>();
    }

    public void pushFront(int val) {
        queue.add(0,val);
    }

    public void pushMiddle(int val) {
        int middle = queue.size() / 2;
        queue.add(middle,val);
    }

    public void pushBack(int val) {
        queue.add(val);
    }

    public int popFront() {
        if(queue.isEmpty()) return -1;
        return queue.remove(0);
    }

    public int popMiddle() {
        if(queue.isEmpty()) return -1;
        int middle = (queue.size() -1 ) / 2;
        return queue.remove(middle);
    }

    public int popBack() {
        if(queue.isEmpty()) return -1;
        return queue.remove(queue.size() - 1);
    }
}
