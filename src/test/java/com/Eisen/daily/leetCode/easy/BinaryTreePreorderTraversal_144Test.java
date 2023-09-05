package com.Eisen.daily.leetCode.easy;

import com.Eisen.daily.leetCode.easy.BinaryTree.BinaryTreePreorderTraversal_144;
import com.tistory.eisen.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

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
        assertEquals(List.of(1,2,3), test.preorderTraversal_recursive(root));
    }
    @Test
    void test2() {
        double a = 0.0;
        Set<Double> c = new HashSet<Double>();
        c.add(a);
        System.out.println(c.contains(-0d));
        System.out.println(a == -0d);


        for (Double aDouble : c) {
            System.out.println(aDouble == -0d);
        }

//        System.out.println(new Double(-0d).hashCode());
//        System.out.println(new Double(0d).hashCode());
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(1);
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root != null) {
            stack.push(root.right);
            list.add(root.val);

            root = root.left;
            if(root == null && !stack.isEmpty()) {
                root = stack.pop();
            }
        }
    }
}