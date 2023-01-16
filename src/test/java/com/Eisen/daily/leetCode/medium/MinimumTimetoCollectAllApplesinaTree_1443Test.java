package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumTimetoCollectAllApplesinaTree_1443Test
 * author : eisen
 * date : 2023-01-11
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-11    AUTHOR: eisen    NOTE: 최초 생성
 */
class MinimumTimetoCollectAllApplesinaTree_1443Test {
    MinimumTimetoCollectAllApplesinaTree_1443 test = new MinimumTimetoCollectAllApplesinaTree_1443();

    @Test
    void test(){
//        n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};
        int n1 = 11;
        int[][] edges1 = {{0,1},{0,2},{1,4},{1,5},{4,7},{4,8},{5,9},{5,10},{2,3},{2,6}};
        List<Boolean> hasApple = List.of(false, false, true, false, true, true, false);
        List<Boolean> hasApple1 = List.of(false, false, true, false, true, true, false,false, true, true, false);

        test.minTime(n, edges, hasApple);
//        test.minTime(n1, edges1, hasApple1);
    }

}