package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : SubarraySumsDivisiblebyK_974Test
 * author : eisen
 * date : 2023-01-19
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-19    AUTHOR: eisen    NOTE: 최초 생성
 */
class SubarraySumsDivisiblebyK_974Test {
    SubarraySumsDivisiblebyK_974 test = new SubarraySumsDivisiblebyK_974();

    @Test
    void test(){
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        assertEquals( 7, test.subarraysDivByK(nums, k));
    }
}