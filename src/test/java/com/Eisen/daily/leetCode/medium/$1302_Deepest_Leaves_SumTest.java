package com.Eisen.daily.leetCode.medium;

import io.github.shanepark.leetcode.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class $1302_Deepest_Leaves_SumTest {
//    root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
//    Output: 15
    $1302_Deepest_Leaves_Sum test = new $1302_Deepest_Leaves_Sum();
    @Test
    void test(){
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.right = node6;

        node4.left = node7;

        node6.right = node8;

//        System.out.println(node1.val);

        Assertions.assertEquals(15, test.deepestLeavesSum(node1));

    }
}