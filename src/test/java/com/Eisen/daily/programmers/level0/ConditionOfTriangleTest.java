package com.Eisen.daily.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionOfTriangleTest {

    ConditionOfTriangle test = new ConditionOfTriangle();
    @Test
    void test(){
        int[] testData = new int[]{2, 1, 3};
        int[] testData2 = new int[]{3, 6, 2};

        test.solution(testData2);
    }
}