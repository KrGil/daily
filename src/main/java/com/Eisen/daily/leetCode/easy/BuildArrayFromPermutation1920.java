package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class BuildArrayFromPermutation1920 {
    public int[] buildArray(int[] nums) {
//        ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//        Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Input: nums = [5,0,1,2,3,4]
//        Output: [4,5,0,1,2,3]
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
