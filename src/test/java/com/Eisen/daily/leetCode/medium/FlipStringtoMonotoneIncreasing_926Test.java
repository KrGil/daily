package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : FlipStringtoMonotoneIncreasing_926Test
 * author : eisen
 * date : 2023-01-17
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-17    AUTHOR: eisen    NOTE: 최초 생성
 */
class FlipStringtoMonotoneIncreasing_926Test {
    FlipStringtoMonotoneIncreasing_926 test = new FlipStringtoMonotoneIncreasing_926();

    @Test
    void test(){
        String str = "00110";
        String str1 ="00011000";
        String str2 ="0101100011";
        test.minFlipsMonoIncr(str2);
    }

}