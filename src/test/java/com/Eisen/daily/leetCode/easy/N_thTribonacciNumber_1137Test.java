package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : N_thTribonacciNumber_1137Test
 * author : eisen
 * date : 2023-01-30
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-30    AUTHOR: eisen    NOTE: 최초 생성
 */
class N_thTribonacciNumber_1137Test {
    N_thTribonacciNumber_1137 test = new N_thTribonacciNumber_1137();

    @Test
    void test (){
        int n = 4;

        assertEquals(4, test.tribonacci(5));
    }

}