package com.Eisen.daily.codingTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.codingTest
 * fileName : sum1Test
 * author :  eisen
 * date : 2022/11/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/11/21                eisen             최초 생성
 */
class sum1Test {
    sum1 test = new sum1();

    @Test
    void test(){
        int[] number = {100, 101, 102, 103, 104};
        int[] start = {1,2};
        int[] finish = {2,4};
        test.solution(number, start, finish);
    }
}