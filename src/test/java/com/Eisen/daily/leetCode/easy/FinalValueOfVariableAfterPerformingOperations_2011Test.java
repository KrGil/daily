package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : FinalValueOfVariableAfterPerformingOperations_2011Test
 * author :  eisen
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/09/28                eisen             최초 생성
 */
class FinalValueOfVariableAfterPerformingOperations_2011Test {
    @Test
    void test(){
        FinalValueOfVariableAfterPerformingOperations_2011 test = new FinalValueOfVariableAfterPerformingOperations_2011();
        //       ["--X","X++","X++"]
        String[] testData = {"--X","X++","X++"};
        System.out.println(test.finalValueAfterOperations(testData));
    }
}