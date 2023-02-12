package com.Eisen.daily.leetCode.easy.depthFirstSearch;

import com.tistory.eisen.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379Test {
    FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379 test = new FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree_1379();
    @Test
    void test(){
//        tree = [7,4,3,null,null,6,19], target = 3
        TreeNode a = new TreeNode(19);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(3,  b, a);
        TreeNode d = new TreeNode(4);
        TreeNode root = new TreeNode(7, d, c);
        TreeNode cloned = root;
//[1,2,3,4,5,6,7,8,9,10]
        TreeNode ten = new TreeNode(10);
        TreeNode nine = new TreeNode(9);
        TreeNode eight = new TreeNode(8, nine, ten);
        TreeNode seven = new TreeNode(7);
        TreeNode six = new TreeNode(6);
        TreeNode five = new TreeNode(5, ten, null);
        TreeNode four = new TreeNode(4, eight, nine);
        TreeNode three = new TreeNode(3, six, seven);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode one = new TreeNode(1, two, three);
        TreeNode clonedOne = one;
//        assertEquals(3, test.getTargetCopy(root, cloned, c).val);
        assertEquals(5, test.getTargetCopy(one, clonedOne, five).val);
    }
}