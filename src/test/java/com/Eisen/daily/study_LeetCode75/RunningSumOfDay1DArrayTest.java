package com.Eisen.daily.study_LeetCode75;

import com.Eisen.daily.leetCode.study_LeetCode75.RunningSumOfDay1DArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RunningSumOfDay1DArrayTest {
    RunningSumOfDay1DArray d1 = new RunningSumOfDay1DArray();
//    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    @Test
    public void day1_테스트하기(){
        d1.hello();
//    Input: nums = [1,2,3,4]
        int[] nums = new int[]{1,2,3,4};

        int[] result = d1.runningSum(nums);

        System.out.println("result: "+ Arrays.toString(result));
//    Output: [1,3,6,10]

    }
}