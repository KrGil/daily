package com.Eisen.daily.leetCode.easy;


import java.util.Arrays;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : LargestPerimeterTriangle_976
 * author :  eisen
 * date : 2022/10/12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/10/12                eisen             최초 생성
 */
public class LargestPerimeterTriangle_976 {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        if(nums[nums.length-1] >= nums[nums.length-2] + nums[nums.length-3]){
            return 0;
        }else{
            return nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3];
        }

    }

}
