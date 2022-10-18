package com.Eisen.daily.leetCode.easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    res[i] = ++cnt;
                }
            }
        }
        return res;
    }
}
