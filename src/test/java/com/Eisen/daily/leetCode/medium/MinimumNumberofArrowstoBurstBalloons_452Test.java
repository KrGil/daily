package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MinimumNumberofArrowstoBurstBalloons_452Test
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
class MinimumNumberofArrowstoBurstBalloons_452Test {
    MinimumNumberofArrowstoBurstBalloons_452 test = new MinimumNumberofArrowstoBurstBalloons_452();
    @Test
    void test(){
        int[][] data = {{10,16},{2,8},{1,6},{7,12}};
        int[][] data2 = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        int[][] data3 = {{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
        assertEquals(2, test.findMinArrowShots(data));
        assertEquals(2, test.findMinArrowShots(data2));
        assertEquals(2, test.findMinArrowShots(data3));
    }
}