package com.Eisen.daily.leetCode.easy;

import com.tistory.eisen.Eisen;

public class ConcatenationOfArray1929 {

    public int[] getConcatenation(int[] nums) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
        
        int length =  nums.length;
        int[] result = new int[length * 2];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            j = i;
            if (i > (length-1)) {
                j = i - (length);
            }
            result[i] = nums[j];
        }
        return null;
    }
}
