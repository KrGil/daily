package com.Eisen.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * packageName :  com.Eisen.daily.programmers
 * fileName : correctParenthesisTest
 * author :  eisen
 * date : 2022/08/27
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/27                eisen             최초 생성
 */
class CorrectParenthesisTest {
    @Test
    @DisplayName("올바른 괄호 문제 검증")
    void testProblem(){
        CorrectParenthesis test = new CorrectParenthesis();
        String s= ")(";
        System.out.println("test.solution(s) = " + test.solution(s));;
    }

}