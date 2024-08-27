package com.Eisen.daily.leetCode.easy;

public class $3190_Find_Minimum_Operations_to_Make_AllElementsDivisiblebyThree {
//    Input: nums = [1,2,3,4]
//
//    Output: 3
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        int a;
        for (int i = 0; i < nums.length; i++) {
            (nums[i] + 1) % 3 == 0 ? cnt++ : null;
        }
    }
}