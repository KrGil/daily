package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : NumberofArithmeticTriplets_2367Test
 * author : eisen
 * date : 2023-01-13
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-13    AUTHOR: eisen    NOTE: 최초 생성
 */
class NumberofArithmeticTriplets_2367Test {
    NumberofArithmeticTriplets_2367 test = new NumberofArithmeticTriplets_2367();
    @Test
    void arithmeticTriplets() {
        // nums = [0,1,4,6,7,10], diff = 3
        // (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
        // (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        assertEquals(2, test.arithmeticTriplets(nums, diff));
    }
}