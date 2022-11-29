package com.Eisen.daily.leetCode.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

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
