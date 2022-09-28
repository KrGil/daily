package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutation1920Test {
    @Test
    @DisplayName("데이터 검증")
    void test(){
        BuildArrayFromPermutation1920 test = new BuildArrayFromPermutation1920();
        //        Input: nums = [0,2,1,5,3,4]
        //        Input: nums = [5,0,1,2,3,4]
        int[] testInput1 = {0, 2, 1, 5, 3, 4};
        int[] testInput2 = {5, 0, 1, 2, 3, 4};
        //        Output: [0,1,2,4,5,3]
        //        Output: [4,5,0,1,2,3]
        int[] testResult1 = {0, 1, 2, 4, 5, 3};
        int[] testResult2 = {4, 5, 0, 1, 2, 3};

        System.out.println(Arrays.toString(test.buildArray(testInput1)));
        Assertions.assertEquals(Arrays.toString(test.buildArray(testInput1)), Arrays.toString(testResult1));
        Assertions.assertEquals(Arrays.toString(test.buildArray(testInput2)), Arrays.toString(testResult2));
    }
}