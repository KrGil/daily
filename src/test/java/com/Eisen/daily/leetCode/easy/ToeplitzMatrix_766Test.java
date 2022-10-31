package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToeplitzMatrix_766Test {
    ToeplitzMatrix_766 test = new ToeplitzMatrix_766();

    @Test
    void test(){
        int[][] testData = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(test.isToeplitzMatrix(testData));
    }
}