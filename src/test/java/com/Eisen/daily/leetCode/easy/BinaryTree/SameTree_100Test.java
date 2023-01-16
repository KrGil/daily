package com.Eisen.daily.leetCode.easy.BinaryTree;

import com.tistory.eisen.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy.BinaryTree
 * fileName : SameTree_100Test
 * author : eisen
 * date : 2023-01-10
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-10    AUTHOR: eisen    NOTE: 최초 생성
 */
class SameTree_100Test {
    SameTree_100 test = new SameTree_100();

    @Test
    void test() {
        TreeNode p = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(15);
        p.left = node1;
        p.right = node2;

        TreeNode q = new TreeNode(10);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(15);
        q.left = node3;
        node3.right = node4;

        assertFalse(test.isSameTree(p, q));
    }

    @Test
    void test2() {
        System.out.println(Arrays.asList(5, -685, 2970, -755, -462, 2770, 3620, null, -714, -649, 434, 373, 2913, 3337, 4201, null, null, null, -497, -400, -95, 313, 1620, 2838, null, 3228, 3574, 3874, 4262, -589, -484, null, -225, -183, null, 240, null, 1357, 2342, null, null, 2988, 3262, 3434, null, 3658, 3885, null, null, -622, null, null, null, -381, null, null, null, 150, null, 1237, 1538, 2235, 2593, null, 3072, null, null, 3349, 3490, null, 3760, null, 4187, null, null, null, -325, 74, null, 701, 1246, 1439, 1583, 2136, 2249, 2553, 2661, 3053, 3174, null, 3384, 3465, null, 3686, 3855, 3971, null, null, null, null, null, 527, 913, null, 1283, null, null, null, null, 1945, 2219, null, null, 2370, null, null, 2694, 3007, null, 3109, null, null, null, null, null, null, null, null, null, null, 4058, 519, 624, 712, 972, null, null, 1736, 1954, null, null, null, 2467, 2692, null, null, null, null, 3115, null, 4100, -203, null, null, null, null, 725, null, 1227, 1670, 1745, 1952, 2030, 2427, null, null, null, null, null, null, null, null, null, null, 817, 1056, null, null, null, null, 1852, null, null, null, 2098, null, null, null, null, null, 1133, 1834, 1929).size());

    }
}