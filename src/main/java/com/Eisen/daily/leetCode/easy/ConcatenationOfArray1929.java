package com.Eisen.daily.leetCode.easy;

import com.tistory.eisen.Eisen;

import java.util.Arrays;

public class ConcatenationOfArray1929 {

    public int[] getConcatenation(int[] nums) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
        
        int n =  nums.length;
        int[] result = new int[n * 2];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + (n)] = nums[i];
        }
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

        return result;
    }
}
