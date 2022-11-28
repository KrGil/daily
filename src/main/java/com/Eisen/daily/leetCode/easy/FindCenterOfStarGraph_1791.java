package com.Eisen.daily.leetCode.easy;

import java.util.HashSet;
import java.util.Set;

public class FindCenterOfStarGraph_1791 {
    public int findCenter(int[][] edges) {
        Set<Integer> res = new HashSet<Integer>();
        for(int i = 0; i < edges.length; i++) {
            for(int j : edges[i]) {
                if (res.contains(j)) {
                    return j;
                }
                res.add(j);
            }
        }
        return -1;
    }
}
