package com.bimurto.leetcodesolutions.educative.graph;

import com.bimurto.leetcodesolutions.educative.graph.Problem743NetworkDelayTime;
import org.junit.Test;

public class Problem743NetworkDelayTimeTest {

    @Test
    public void networkDelayTimeTest() {
        Problem743NetworkDelayTime solution = new Problem743NetworkDelayTime();
//        var result1 = solution.networkDelayTime(new int{}{}{
//                {2,1,1},{2,3,1},{3,4,1}
//        }, 4,2);
//        System.out.println(solution.networkDelayTime(new int{}{}{
//                {1,2,1},{2,1,3}
//        }, 2,2));
//        System.out.println(solution.networkDelayTime(new int{}{}{
//                {1,2,1},{2,3,2},{1,3,2}
//        }, 3,1));
//        System.out.println(solution.networkDelayTime(new int{}{}{
//                {1,2,1},{2,3,2},{1,3,4}
//        }, 3,1));
        System.out.println(solution.networkDelayTime(new int[][]{
                {3,5,78},{2,1,1},{1,3,0},{4,3,59},{5,3,85},{5,2,22},{2,4,23},{1,4,43},{4,5,75},{5,1,15},{1,5,91},{4,1,16},{3,2,98},{3,4,22},{5,4,31},{1,2,0},{2,5,4},{4,2,51},{3,1,36},{2,3,59}
        }, 5,5));

    }
}
