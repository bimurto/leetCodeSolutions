package com.bimurto.leetcodesolutions.educative.slidingwindow;

import java.util.*;

public class Problem239SlidingWindowMaximum {
    public int[] maxSlidingWindowV1(int[] nums, int k) {
        var priorityQueue = new PriorityQueue<Pair>((o1, o2) -> o2.value - o1.value);
        for (int j = 0; j < k; j++) {
            priorityQueue.add(new Pair(nums[j], j));
        }
        var result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (i != 0) {
                priorityQueue.add(new Pair(nums[i + k - 1], i + k - 1));
                while (priorityQueue.peek() != null && priorityQueue.peek().index < i) {
                    priorityQueue.poll();
                }
            }
            result[i] = priorityQueue.peek() == null ? 0 : priorityQueue.peek().value;
        }
        return result;
    }

    static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        var deque = new LinkedList<Integer>();
        var result = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        result[0] = nums[deque.peekFirst()];
        for (int i = k; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }

    static void printMax(int arr[], int N, int K)
    {

        // Create a Double Ended Queue, Qi
        // that will store indexes of array elements
        // The queue will store indexes of
        // useful elements in every window and it will
        // maintain decreasing order of values
        // from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()]
        // are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();

        /* Process first k (or first window)
        elements of array */
        int i;
        for (i = 0; i < K; ++i) {

            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!Qi.isEmpty()
                    && arr[i] >= arr[Qi.peekLast()])

                // Remove from rear
                Qi.removeLast();

            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (; i < N; ++i) {

            // The element at the front of the
            // queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which
            // are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();

            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!Qi.isEmpty())
                    && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }

}
