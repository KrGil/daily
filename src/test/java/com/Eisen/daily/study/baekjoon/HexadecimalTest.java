package com.Eisen.daily.study.baekjoon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.study.baekjoon
 * fileName : HexadecimalTest
 * author :  eisen
 * date : 2022/08/19
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/19                eisen             최초 생성
 */
class HexadecimalTest {
    @Test
    void 풀이(){
        Hexadecimal hexa = new Hexadecimal();
        System.out.println("gap = "+hexa.solution("10"));
    }
}