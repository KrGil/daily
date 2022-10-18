package com.Eisen.daily.leetCode.easy;


import java.util.Arrays;

public class DecompressRunLengthEncodedList_1313 {
    // Input: nums = [1,2,3,4]
    // Output: [2,4,4,4]
    public int[] decompressRLElist(int[] nums) {
        int total = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                total += nums[i];
            }
        }
        int[] res = new int[total];
        int cnt = 0;
        System.out.println("nums = " + Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            System.out.println("i = " + i);
            if (i % 2 != 0) {
                System.out.println(nums[i]);
                for (int j = 0; j < nums[i-1]; j++) {
                    res[cnt] = nums[i];
                    System.out.println("res[cnt] = " + res[cnt]);
                    cnt++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        System.out.println(total);
        return null;
    }
}
