package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : NumberofNodesintheSubTreeWiththeSameLabel_1519Test
 * author : eisen
 * date : 2023-01-12
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-12    AUTHOR: eisen    NOTE: 최초 생성
 */
class NumberofNodesintheSubTreeWiththeSameLabel_1519Test {
    NumberofNodesintheSubTreeWiththeSameLabel_1519 test = new NumberofNodesintheSubTreeWiththeSameLabel_1519();
    @Test
    void test(){
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        String labels = "abaedcd";
//        Output: [2,1,1,1,1,1,1]

        int n1 = 4;
        int[][] edges1 = {{0,1},{1,2},{0,3}};
        String labels1 = "bbbb";
//        Output: [4,2,1,1]
        test.countSubTrees(n, edges, labels);
    }
    @Test
    void test2(){
        List<Integer>[] a = new ArrayList[5];
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        a[0] = b;
        for (Integer i : a[0]) {
            System.out.println(i);
        }
        System.out.println("a = " + Arrays.toString(a));

        int[] ans = new int[5];
        int[] res = new int[5];
        res[0] = ++ans['b'-'a'];
        res[1] = ans['b'-'a']++;
        System.out.println("Arrays.toString(ans) = " + Arrays.toString(ans));
        System.out.println("res = " + Arrays.toString(res));
        int test = 5;
        int test1 = ++test;
        System.out.println("test1 = " + test1);
        System.out.println("test = " + test);
    }
}