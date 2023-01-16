package com.Eisen.daily.leetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : NumberofNodesintheSubTreeWiththeSameLabel_1519
 * author : eisen
 * date : 2023-01-12
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-12    AUTHOR: eisen    NOTE: 최초 생성
 */
public class NumberofNodesintheSubTreeWiththeSameLabel_1519 {
    int[] res;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<List<Integer>> adjacent = new ArrayList<>();
        res = new int[n];

        for (int i = 0; i < n; i++) {
            adjacent.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjacent.get(edge[0]).add(edge[1]);
            adjacent.get(edge[1]).add(edge[0]);
        }
        dfs(-1, 0, adjacent, labels);
        return res;
    }
    public int[] dfs(int prev, int curr, List<List<Integer>> adjacent, String labels) {
        int[] cnt = new int[26];
        for (Integer vertex : adjacent.get(curr)) {
            if (prev != vertex) {
                int[] preCnt = dfs(curr, vertex, adjacent, labels);
                // combining the frequencies of left and right subtrees into one array
                for(int i = 0; i < preCnt.length; i++)
                    cnt[i] += preCnt[i];
            }
        }
        res[curr] = ++cnt[labels.charAt(curr)-'a'];
        return cnt;
    }
}
