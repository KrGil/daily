package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmallerThanTheCurrentNumber_1365Test {
    HowManyNumbersAreSmallerThanTheCurrentNumber_1365 test = new HowManyNumbersAreSmallerThanTheCurrentNumber_1365();
    @Test
    @DisplayName("testName")
    void test(){
        int[] testData = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(test.smallerNumbersThanCurrent(testData)));
        Assertions.assertArrayEquals(new int[]{4,0,1,1,3}, test.smallerNumbersThanCurrent(testData));
    }

}