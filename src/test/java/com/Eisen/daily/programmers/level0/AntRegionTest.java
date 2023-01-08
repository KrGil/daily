package com.Eisen.daily.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.programmers.level0
 * fileName : AntRegionTest
 * author : eisen
 * date : 2023-01-05
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-05    AUTHOR: eisen    NOTE: 최초 생성
 */
class AntRegionTest {
    AntRegion test = new AntRegion();

    @Test
    void test(){
        int data = 23;
        assertEquals(5, test.solution(data));
    }

}