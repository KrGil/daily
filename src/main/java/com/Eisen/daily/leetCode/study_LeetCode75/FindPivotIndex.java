package com.Eisen.daily.leetCode.study_LeetCode75;

public class FindPivotIndex {
//    Input: nums = [1,7,3,6,5,6]
//    Output: 3
//    Explanation:
//    The pivot index is 3.
//    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//    Right sum = nums[4] + nums[5] = 5 + 6 = 11
    public int findPivotIndex(int[] nums){
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
            if(sum == left){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}

