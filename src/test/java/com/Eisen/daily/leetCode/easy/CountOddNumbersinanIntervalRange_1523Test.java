package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CountOddNumbersinanIntervalRange_1523Test
 * author :  eisen
 * date : 2023/02/13
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/13                eisen             최초 생성
 */
class CountOddNumbersinanIntervalRange_1523Test {
    CountOddNumbersinanIntervalRange_1523 test = new CountOddNumbersinanIntervalRange_1523();
    @Test
    void test(){
        int low = 21; int high = 22;
        int low2 = 8; int high2 = 10;

        assertEquals(1, test.countOdds(low, high));
        assertEquals(1, test.countOdds(low2, high2));

    }
}