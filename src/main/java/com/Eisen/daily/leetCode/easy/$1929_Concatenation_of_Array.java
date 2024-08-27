package com.Eisen.daily.leetCode.easy;

public class $1929_Concatenation_of_Array {
//    Input: nums = [1,2,1]
//    Output: [1,2,1,1,2,1]
//    Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length*2)+1];
        int cnt = 0;
        for (int i = 0; i < ans.length; i++) {
            cnt++;
            if(i > nums.length){
                    cnt=0;
            }
            ans[i] = nums[i];
        }
        System.out.println();
    }
}