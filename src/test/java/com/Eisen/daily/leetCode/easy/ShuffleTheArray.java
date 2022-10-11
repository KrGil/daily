package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

public class ShuffleTheArray {
//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length / 2 ; i++) {
            result[j] = nums[i];
            result[j + 1] = nums[(nums.length / 2) + i];
            j += 2;
        }
        return result;
    }
//    public int[] shuffle(int[] nums, int n) {
//        int[] odds = new int[n];
//        int[] evens = new int[n];
//
//        int[] result = new int[2 * n];
//        for (int i = 0; i < n; i++) {
//            odds[i] = nums[i];
//            evens[i] = nums[i + n];
//        }
//        int evenCnt = 0;
//        int oddCnt = 0;
//        for (int i = 1; i <= n*2; i++) {
//            System.out.println("i = " + i);
//            System.out.println("i % 2 = " + i % 2);
//            if (i % 2 != 0) {
//                System.out.println("oddCnt = " + oddCnt);
//                result[i-1] = odds[oddCnt];
//                oddCnt++;
//            } else {
//                System.out.println("evenCnt = " + evenCnt);
//                result[i-1] = evens[evenCnt];
//                evenCnt++;
//            }
//        }
//        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
//        return result;
//    }
}

