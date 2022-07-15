package com.Eisen.daily.study_LeetCode75;

import com.Eisen.daily.leetCode.study_LeetCode75.FindPivotIndex;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {
//    Input: nums = [1,7,3,6,5,6]
//    Output: 3
//    Explanation:
//    The pivot index is 3.
//    Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//    Right sum = nums[4] + nums[5] = 5 + 6 = 11
    FindPivotIndex find = new FindPivotIndex();
    @Test
    void findPivotIndexClient(){
//        int[] nums = {1,7,3,6,5,6};
        int[] nums = {1,2,3};

        System.out.println(find.findPivotIndex(nums));
    }
}