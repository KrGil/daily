package com.Eisen.daily.leetCode.medium;

import io.github.shanepark.leetcode.TreeNode;

public class $1302_Deepest_Leaves_Sum {
    int maxDepth;
    public int deepestLeavesSum(TreeNode root) {
        maxDepth = getDepth(root, 0);
        return sum(0, root, 0) / 2;
    }
    public int sum(int t, TreeNode node, int depth) {
        if(node == null){
            return depth-1 == maxDepth ? t : 0;
        }else{
            t = node.val;
            return sum(t, node.left, depth+1) + sum(t, node.right, depth+1);
        }
    }
    public int getDepth(TreeNode node, int depth) {
        return node == null ? depth - 1 : Math.max(getDepth(node.left, depth + 1), getDepth(node.right, depth + 1));
    }

}

