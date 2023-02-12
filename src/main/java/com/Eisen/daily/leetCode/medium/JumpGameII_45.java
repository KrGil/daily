package com.Eisen.daily.leetCode.medium;

public class JumpGameII_45 {
    public int jump(int[] nums) {
        //[2,3,1,1,4]
        int jumpCnt = 0;
        int currIndex = 0;
        int jump = 0;

        for (int i = 0; i < nums.length; i++) {
            jump = Math.max(jump, i + nums[i]);

        }
        return 0;
    }
}
