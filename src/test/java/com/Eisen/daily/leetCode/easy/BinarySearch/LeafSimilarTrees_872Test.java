package com.Eisen.daily.leetCode.easy.BinarySearch;

import com.Eisen.daily.leetCode.easy.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTrees_872Test {
    LeafSimilarTrees_872 test = new LeafSimilarTrees_872();

    @Test
    void test(){
        TreeNode testData = new TreeNode(3);
        TreeNode testData1 = new TreeNode(5);
        TreeNode testData2 = new TreeNode(6);
        TreeNode testData3 = new TreeNode(2);
        TreeNode testData4 = new TreeNode(7);
        TreeNode testData5 = new TreeNode(4);
        TreeNode testData6 = new TreeNode(1);
        TreeNode testData7 = new TreeNode(9);
        TreeNode testData8 = new TreeNode(8);
        testData.left = testData1;
        testData.right = testData6;

        testData1.left = testData2;
        testData1.right = testData3;
        testData3.left = testData4;
        testData3.right = testData5;

        testData6.left = testData7;
        testData6.right = testData8;


        TreeNode testData0 = new TreeNode(3);
        TreeNode testData10 = new TreeNode(5);
        TreeNode testData20 = new TreeNode(6);
        TreeNode testData30 = new TreeNode(7);
        TreeNode testData40 = new TreeNode(1);
        TreeNode testData50 = new TreeNode(4);
        TreeNode testData60 = new TreeNode(2);
        TreeNode testData70 = new TreeNode(9);
        TreeNode testData80 = new TreeNode(8);
        testData0.left = testData10;
        testData0.right = testData40;

        testData10.left = testData20;
        testData10.right = testData30;
        testData40.left = testData50;
        testData40.right = testData60;

        testData60.left = testData70;
        testData60.right = testData80;


        assertTrue(test.leafSimilar(testData, testData0));
    }
}