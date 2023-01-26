package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : MaximumSumCircularSubarray_918
 * author :  eisen
 * date : 2023/01/18
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/18                eisen             최초 생성
 */
public class MaximumSumCircularSubarray_918 {
    public int maxSubarraySumCircular(int[] nums) {
        System.out.println("nums = " + nums);
        int max = 0;
        int sum = 0;
        max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if( nums[i] < sum )
                sum += nums[i];

            max = Integer.max(max, nums[i]);

        }


        return 0;
    }
}
