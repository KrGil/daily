package com.Eisen.daily.leetCode.easy.BinarySearch;

import com.tistory.eisen.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        generate(list1, root1);
        generate(list2, root2);

        System.out.println("list1 = " + list1);
        System.out.println("list1 = " + list2);
        return list1.equals(list2);
    }
    public void generate(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        generate(list, root.left);
        generate(list, root.right);
    }
}
