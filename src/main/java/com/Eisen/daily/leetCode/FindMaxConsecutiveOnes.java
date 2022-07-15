package com.Eisen.daily.leetCode;

/**
 * packageName :  com.example.dailyProgramming
 * fileName : FindMaxConsecutiveOnes
 * author :  eisen
 * date : 2022/06/12
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/06/12                eisen             최초 생성
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 1;
        int[] result = new int[nums.length];

        for (int j = 1; j < nums.length; j++) {
            if(nums[j-1] == 1 && nums[j-1] == nums[j]){
                count++;
                System.out.println("nums[j-1] = "+(j-1)+" count: "+count);
                result[j-1] = count;
            }else{
                count = 0;
            }
        }
        return count+1;
    }
}
