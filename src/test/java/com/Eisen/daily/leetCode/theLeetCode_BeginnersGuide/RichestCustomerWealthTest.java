package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {
    @Test
    void maximumWelthTest(){
        //[[1,2,3],[3,2,1]]
        RichestCustomerWealth test = new RichestCustomerWealth();
        int[][] testArray = {
            {1,2,3},
            {3,2,1}
        };
        System.out.println("test.maximumWealth(testArray) = " + test.maximumWealth(testArray));
    }
}