package com.Eisen.daily.leetCode.easy.BinaryTree;

import com.tistory.eisen.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * packageName : com.Eisen.daily.leetCode.easy.BinarySearch
 * fileName : BinaryTreePreorderTraversal_144
 * author : eisen
 * date : 2023-01-09
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-09    AUTHOR: eisen    NOTE: 최초 생성
 */
public class BinaryTreePreorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null) {
            result.add(root.val);
            stack.push(root.right);

            root = root.left;
            if (root == null && !stack.empty()) {
                root = stack.pop();
            }
        }
        return result;
    }
    public List<Integer> preorderTraversal_recursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        result = preorderTraversal_recursive(root, result);
        return result;
    }
    public List<Integer> preorderTraversal_recursive(TreeNode root, List<Integer> result) {
        if(root == null) return result;

        result.add(root.val);
        preorderTraversal_recursive(root.left, result);
        preorderTraversal_recursive(root.right, result);
        return result;
    }



}
