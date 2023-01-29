package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : SumofAllOddLengthSubarrays_1588Test
 * author : eisen
 * date : 2023-01-27
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-27    AUTHOR: eisen    NOTE: 최초 생성
 */
class SumofAllOddLengthSubarrays_1588Test {
    SumofAllOddLengthSubarrays_1588 test =  new SumofAllOddLengthSubarrays_1588();
    @Test
    void test(){
        int[] arr = {1, 4, 2, 5, 3};
        assertEquals(58, test.sumOddLengthSubarrays(arr));
    }
}