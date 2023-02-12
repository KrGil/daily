package com.Eisen.daily.leetCode.easy.depthFirstSearch;

import com.tistory.eisen.TreeNode;

public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original.right == null && original.left == null){
            return original;
        }
        return  dfs(original, cloned, target);
    }
    public TreeNode dfs(TreeNode preNode, TreeNode source, TreeNode target) {
        if(source == null){
            return preNode;
        }
        System.out.println("source = " + source.val);
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        if(source.val == target.val){
            return source;
        }else{
            left = dfs(source, source.left, target);
            right = dfs(source, source.right, target);
        }
        if(left == target) System.out.println("left = " + left.val);
        if(right == target) System.out.println("right = " + right.val);
        return left.val == target.val ? left : right;
    }
}
