package com.Eisen.daily.leetCode.study_LeetCode75;

public class RunningSumOfDay1DArray {
    //    Input: nums = [1,2,3,4]
//    Output: [1,3,6,10]
//    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            result[i] = sum;
        }
        return result;
    }

    public String hello(){
        return "hello";
    }
}
