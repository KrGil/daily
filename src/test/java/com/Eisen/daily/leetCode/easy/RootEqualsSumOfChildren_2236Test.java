package com.Eisen.daily.leetCode.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class RootEqualsSumOfChildren_2236Test {
    RootEqualsSumOfChildren_2236 test = new RootEqualsSumOfChildren_2236();

    @Test
    void test(){
        TreeNode testData = new TreeNode();
        testData.val = 9;
        TreeNode left = new TreeNode();
        left.val = 4;
        TreeNode right = new TreeNode();
        right.val = 6;
        testData.left = left;
        testData.right = right;
        log.info("{}", test.checkTree(testData));
    }

}