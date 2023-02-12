package com.Eisen.daily.programmers.level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.programmers.level_2
 * fileName : UninhabitedIslandTest
 * author :  eisen
 * date : 2023/02/08
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/02/08                eisen             최초 생성
 */
class UninhabitedIslandTest {
    UninhabitedIsland test = new UninhabitedIsland();
    @Test
    void test(){
        String[] maps = {"X591X", "X1X5X", "X231X", "1XXX1"};

        assertArrayEquals(new int[]{1,1,27}, test.solution(maps));
    }
}