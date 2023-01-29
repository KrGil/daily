package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : CountNumberofPairsWithAbsoluteDifferenceK_2006Test
 * author : eisen
 * date : 2023-01-27
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-27    AUTHOR: eisen    NOTE: 최초 생성
 */
class CountNumberofPairsWithAbsoluteDifferenceK_2006Test {
    CountNumberofPairsWithAbsoluteDifferenceK_2006 test = new CountNumberofPairsWithAbsoluteDifferenceK_2006();

    @Test
    void test(){
        int[] nums = {1,2,2,1};
        int k = 1;
        assertEquals(4, test.countKDifference(nums, k));
    }

}