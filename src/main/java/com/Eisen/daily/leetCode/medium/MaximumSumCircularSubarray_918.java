package com.Eisen.daily.leetCode.medium;

import com.tistory.eisen.Eisen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MaximumSumCircularSubarray_918
 * author : eisen
 * date : 2023-01-18
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-18    AUTHOR: eisen    NOTE: 최초 생성
 */
public class MaximumSumCircularSubarray_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int res = 0;
        int n = nums.length;
        System.out.println("nums.length = " + nums.length);
        int max = 0;
        max = IntStream.of(nums).max().orElse(Integer.MIN_VALUE);
        System.out.println("maxI = " + max);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            System.out.println("nums[i] = " + nums[i]);
            System.out.println("(i - 1 + n) % n = " + (i - 1 + n) % n);
            System.out.println("nums[(i - 1 + n) % n] = " + nums[(i - 1 + n) % n]);
            System.out.println();
        }

//        Eisen.logMeasuredExecutionTime(this::max, nums);
        return res;
    }
    public void max(int[] nums) {
        IntStream.of(nums).max().orElse(Integer.MIN_VALUE);
    }
}
