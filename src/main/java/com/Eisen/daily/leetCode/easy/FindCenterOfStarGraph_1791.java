package com.Eisen.daily.leetCode.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FindCenterOfStarGraph_1791 {
    public int findCenter(int[][] edges) {
        Set<Integer> res = new HashSet<Integer>();
        for(int i = 0; i < edges.length; i++) {
            for(int node : edges[i]) {
                if (res.contains(node)) {
                    return node;
                }
                res.add(node);
            }
        }
        return -1;
    }
}
