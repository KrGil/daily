package com.Eisen.daily.leetCode.easy;

import com.github.shanepark.Ps;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : CountNumberofPairsWithAbsoluteDifferenceK_2006
 * author : eisen
 * date : 2023-01-27
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-27    AUTHOR: eisen    NOTE: 최초 생성
 */
public class CountNumberofPairsWithAbsoluteDifferenceK_2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            result += map.getOrDefault(nums[i] + k, 0)+map.getOrDefault(nums[i] - k, 0);
        }
        return result;

    }
}