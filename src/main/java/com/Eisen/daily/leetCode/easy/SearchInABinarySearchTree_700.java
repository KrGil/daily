package com.Eisen.daily.leetCode.easy;

import com.tistory.eisen.TreeNode;

public class SearchInABinarySearchTree_700 {
    // recursion method
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }
        if(root.val > val){
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

    // iterative
    public TreeNode searchBST2(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        while(root != null && root.val != val){
            root = root.val > val ? root.left : root.right;
        }
        return root;
    }
}
