package com.Eisen.daily.leetCode.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class MinimumSumOfFourDigitNumberAfterSplittingDigits_2160Test {
    MinimumSumOfFourDigitNumberAfterSplittingDigits_2160 test = new MinimumSumOfFourDigitNumberAfterSplittingDigits_2160();
    int testData = 2932;
    @Test
    @DisplayName("Integer로만 풀기")
    void test1(){
        test.solution(testData);
    }

    @Test
    @DisplayName("Integer로만 풀기")
    void test2(){
        log.info("log {}", test.solution2(testData));
    }
}