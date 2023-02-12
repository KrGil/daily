package com.Eisen.daily.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * packageName :  com.Eisen.daily.programmers.level0
 * fileName : Only_two_passwordsTest
 * author :  eisen
 * date : 2023/02/08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/08                eisen             최초 생성
 */
class Only_two_passwordsTest {
    Only_two_passwords test = new Only_two_passwords();
    @Test
    void test(){
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        assertEquals(  "happy", test.solution(s, skip, index));
    }
}