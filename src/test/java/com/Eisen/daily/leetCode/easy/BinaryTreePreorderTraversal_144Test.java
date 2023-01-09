package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : BinaryTreePreorderTraversal_144Test
 * author : eisen
 * date : 2023-01-09
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-09    AUTHOR: eisen    NOTE: 최초 생성
 */
class BinaryTreePreorderTraversal_144Test {
    BinaryTreePreorderTraversal_144 test = new BinaryTreePreorderTraversal_144();

    @Test
    void test(){
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = null;
        root.right = node1;

        node1.left = node2;

        assertEquals(List.of(1,2,3), test.preorderTraversal(root));
    }
}