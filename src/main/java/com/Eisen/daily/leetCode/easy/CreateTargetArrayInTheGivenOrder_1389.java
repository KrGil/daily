package com.Eisen.daily.leetCode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder_1389 {
    //Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
    //Output: [0,4,1,3,2]
    //Explanation:
    //nums       index     target
    //0            0        [0]
    //1            1        [0,1]
    //2            2        [0,1,2]
    //3            2        [0,1,3,2]
    //4            1        [0,4,1,3,2]
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        int[] resArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        int cnt = 0;
        for (Integer re : res) {
            resArr[cnt++] = re;
        }

        return resArr;
    }
}
