package com.Eisen.daily.programmers.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.programmers.test
 * fileName : Test1Test
 * author :  eisen
 * date : 2023/02/11
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/11                eisen             최초 생성
 */
class Test1Test {
    Test1 test = new Test1();

    @Test
    void test(){
        int[] data1 = {2,0};
        int[] data2 = {3, 1};
        int[][] data = new int[][]{data1, data2};
        assertArrayEquals(new int[]{0,0}, test.solution(data) );
    }
    @Test
    void palindromeTest(){
        int[] data1 = {2, 0};
        assertFalse(test.isPalindrome(data1));
    }
}