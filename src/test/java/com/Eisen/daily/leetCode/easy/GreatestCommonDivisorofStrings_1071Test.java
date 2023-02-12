package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : GreatestCommonDivisorofStrings_1071Test
 * author :  eisen
 * date : 2023/02/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/01                eisen             최초 생성
 */
class GreatestCommonDivisorofStrings_1071Test {
    GreatestCommonDivisorofStrings_1071 test = new GreatestCommonDivisorofStrings_1071();
    @Test
    void test(){
        String str1 = "ABCABC";
        String str2 = "ABC";
        assertEquals("ABC", test.gcdOfStrings(str1, str2));
    }

}