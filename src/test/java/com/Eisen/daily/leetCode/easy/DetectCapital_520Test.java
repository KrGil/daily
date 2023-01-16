package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : DetectCapital_520Test
 * author :  eisen
 * date : 2023/01/02
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/02                eisen             최초 생성
 */
class DetectCapital_520Test {
    DetectCapital_520 test = new DetectCapital_520();
    @Test
    void test(){
        String str = "USA";
        String str2 = "UsA";
        String str3 = "Usa";
        assertTrue(test.detectCapitalUse(str));
        assertFalse(test.detectCapitalUse(str2));
        assertTrue(test.detectCapitalUse(str3));

    }
}