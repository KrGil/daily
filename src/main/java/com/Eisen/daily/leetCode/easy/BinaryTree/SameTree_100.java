package com.Eisen.daily.leetCode.easy.BinaryTree;

import com.tistory.eisen.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.Eisen.daily.leetCode.easy.BinaryTree
 * fileName : SameTree_100
 * author : eisen
 * date : 2023-01-10
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-10    AUTHOR: eisen    NOTE: 최초 생성
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> list1 = new ArrayList<Integer>();
//        preorderTraversal(p, list);
//        preorderTraversal(q, list1);
//        return list.equals(list1);

    }
    public void preorderTraversal(TreeNode p, List<Integer> list){
        if(p == null) {
            list.add(null);
            return;
        }
        list.add(p.val);
        preorderTraversal(p.left, list);
        preorderTraversal(p.right, list);
    }
}
