package com.Eisen.daily.leetCode.easy;

public class RootEqualsSumOfChildren_2236 {
    public static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean checkTree(TreeNode root) {
        TreeNode right = root.right;
        TreeNode left = root.left;

        return root.val == right.val + left.val ? true : false;
    }
}
         



