package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CreateTargetArrayInTheGivenOrder_1389Test {
    CreateTargetArrayInTheGivenOrder_1389 test = new CreateTargetArrayInTheGivenOrder_1389();
    //Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    @Test
    void test(){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(test.createTargetArray(nums, index)));
    }
}