package com.Eisen.daily.leetCode.easy;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : NumberofArithmeticTriplets_2367
 * author : eisen
 * date : 2023-01-13
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-13    AUTHOR: eisen    NOTE: 최초 생성
 */
public class NumberofArithmeticTriplets_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        // 3
        // 0,1,4,6,7,10
        // 3,4,7,9,10,13
        // n - 1
        // 3 - 1 == 2

        // 2
        // 4,5,6,7,8,9
        // 6,7,8,9,10,11
        // 4 - 1 == 3

        int[] copy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i]+diff;
        }
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int n : copy) {
                if (nums[i] == n) {
                    cnt++;
                }
            }
        }

        return cnt-1;
    }
}
