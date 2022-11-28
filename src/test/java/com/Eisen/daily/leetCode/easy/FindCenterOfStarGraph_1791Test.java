package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCenterOfStarGraph_1791Test {
    FindCenterOfStarGraph_1791 test = new FindCenterOfStarGraph_1791();

    @Test
    void test(){
        int[][] testData1 = {{1,2},{2,3},{4,2}};
        int[][] testData2 = {{1,2},{5,1},{1,3},{1,4}};
        assertEquals(2, test.findCenter(testData1));
        assertEquals(1, test.findCenter(testData2));
    }
}