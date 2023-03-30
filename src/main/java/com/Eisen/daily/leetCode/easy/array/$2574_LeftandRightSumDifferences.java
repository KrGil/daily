package com.Eisen.daily.leetCode.easy.array;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class $2574_LeftandRightSumDifferences {
    @Test
    void test(){
        int[] data = {10, 4, 8, 3};
        Assertions.assertArrayEquals(new int[]{15,1,11,22}, leftRigthDifference(data));
    }
    public int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 0;
        int maxSum = 0;
        for (int num : nums) {
            maxSum += num;
        }
        int leftSum;
        int rightSum;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            leftSum = sum - nums[i];
            rightSum = maxSum - sum;
            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }

}
