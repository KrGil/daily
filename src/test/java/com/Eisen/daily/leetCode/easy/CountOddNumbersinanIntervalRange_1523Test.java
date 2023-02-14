package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersinanIntervalRange_1523Test {
    CountOddNumbersinanIntervalRange_1523 test = new CountOddNumbersinanIntervalRange_1523();

    @Test
    void test(){
        int low = 3; int high = 7;
        assertEquals(3, test.countOdds(low, high));

    }

}