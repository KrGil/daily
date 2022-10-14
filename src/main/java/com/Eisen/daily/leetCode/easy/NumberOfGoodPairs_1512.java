package com.Eisen.daily.leetCode.easy;

public class NumberOfGoodPairs_1512 {
    // [1,2,3,1,1,3]
    // nums[i] == nums[j] and i < j.
    public int numIdenticalPairs(int[] nums) {
//        nums[i] == nums[j] and i < j
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i < j) {
                        System.out.println("i = " + i);
                        System.out.println("j = " + j);
                        cnt++;
                        System.out.println("cnt = " + cnt);
                    }
                }
            }
        }
        return cnt;
    }

//    [1,2,3,1,1,3]
    public static int numIdenticalPairs2(int[] nums){
        int[] temp = new int[101];
        int cnt = 0;

        for (int num : nums) {
            cnt += temp[num]++;
        }

        return cnt;
    }

}
