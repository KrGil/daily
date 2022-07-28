package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RichestCustomerWealth {
    //[[1,2,3],[3,2,1]]
    public int maximumWealth(int[][] accounts){

        return List.of(accounts).stream()
            .map(e -> Arrays.stream(e).sum())
            .map(e -> e.intValue())
            .collect(Collectors.toList())
            .stream()
            .max((o1, o2) -> o1.compareTo(o2))
            .orElseThrow(() -> new IllegalArgumentException(""));
    }
}
