package com.Eisen.daily.leetCode.easy;

public class RootEqualsSumOfChildren_2236 {


    public boolean checkTree(TreeNode root) {
        TreeNode right = root.right;
        TreeNode left = root.left;

        return root.val == right.val + left.val ? true : false;
    }
}
         



