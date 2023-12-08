package com.bimurto.leetcodesolutions.educative.graph;

import org.junit.Assert;
import org.junit.Test;

public class Problem2077PathsInMazeToSameRoomTest {

    @Test
    public void test1(){
        var n = 5;
        var corridors = new int[][]{{1,2},{5,2},{4,1},{2,4},{3,1},{3,4}};
        Assert.assertEquals(2, new Problem2077PathsInMazeToSameRoom().numberOfPaths(n, corridors));
    }

    @Test
    public void test2(){
        var n = 10;
        var corridors = new int[][]{{8,10},{7,9},{9,8},{9,6},{1,4},{1,3},{3,7},{3,5},{10,1},{8,7},{10,3},{10,5},{2,6},{6,5},{8,5},{8,6},{1,7},{3,9},{5,7},{2,7},{7,4},{4,5},{4,9},{2,4},{3,6},{4,3}};
        Assert.assertEquals(20, new Problem2077PathsInMazeToSameRoom().numberOfPaths(n, corridors));
    }
}
