package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : TruncateSentence_1816Test
 * author :  eisen
 * date : 2023/01/31
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/31                eisen             최초 생성
 */
class TruncateSentence_1816Test {
    TruncateSentence_1816 test = new TruncateSentence_1816();

    @Test
    void test(){
        String s = "Hello how are you Contestant";
        int k = 4;
        assertEquals("Hello how are you", test.truncateSentence(s, k));
    }
}