package com.Eisen.daily.leetCode.easy;

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
}
