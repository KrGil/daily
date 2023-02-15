package com.Eisen.daily.leetCode.easy.depthFirstSearch;

import com.tistory.shanepark.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * packageName :  com.Eisen.daily.leetCode.easy.depthFirstSearch
 * fileName : MergeTwoBinaryTrees_617Test
 * author :  eisen
 * date : 2023/02/13
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/13                eisen             최초 생성
 */
class MergeTwoBinaryTrees_617Test {
    MergeTwoBinaryTrees_617 test = new MergeTwoBinaryTrees_617();

    @Test
    void test(){
        TreeNode root1 = TreeNode.of(1,3,2,5);
        TreeNode root2 = TreeNode.of(2, 1, 3, null, 4, null, 7);

        test.mergeTrees(root1, root2);

    }
}