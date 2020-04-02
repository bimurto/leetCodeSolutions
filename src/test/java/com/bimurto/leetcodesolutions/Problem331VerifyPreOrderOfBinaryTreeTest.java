package com.bimurto.leetcodesolutions;

import org.junit.Assert;
import org.junit.Test;

public class Problem331VerifyPreOrderOfBinaryTreeTest {

    @Test
    public void test1(){
        String preOrder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        Assert.assertEquals(true, new Problem331VerifyPreOrderOfBinaryTree().isValidSerialization(preOrder));
    }

    @Test
    public void test2(){
        String preOrder = "1,#";
        Assert.assertEquals(false, new Problem331VerifyPreOrderOfBinaryTree().isValidSerialization(preOrder));
    }

    @Test
    public void test3(){
        String preOrder = "1,#,#,1";
        Assert.assertEquals(false, new Problem331VerifyPreOrderOfBinaryTree().isValidSerialization(preOrder));
    }


    @Test
    public void test4(){
        String preOrder = "7,2,#,2,#,#,#,6,#";
        Assert.assertEquals(false, new Problem331VerifyPreOrderOfBinaryTree().isValidSerialization(preOrder));
    }
}
