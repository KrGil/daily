package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : MaximumSumCircularSubarray_918Test
 * author : eisen
 * date : 2023-01-18
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-18    AUTHOR: eisen    NOTE: 최초 생성
 */
class MaximumSumCircularSubarray_918Test {
    MaximumSumCircularSubarray_918 test = new MaximumSumCircularSubarray_918();
    @Test
    void test(){
        int[] nums = {1,-2,3,-2};
        assertEquals(3, test.maxSubarraySumCircular(nums));
    }
}