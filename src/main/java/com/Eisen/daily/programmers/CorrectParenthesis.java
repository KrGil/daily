package com.Eisen.daily.programmers;

/**
 * packageName :  com.Eisen.daily.programmers
 * fileName : correctParenthesis
 * author :  eisen
 * date : 2022/08/27
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/08/27                eisen             최초 생성
 */
public class CorrectParenthesis {
    boolean solution(String s) {
        char[] cArr = s.toCharArray();
        if(cArr[0] != '(') return false;
        int cnt = 0;
        for (char c : cArr) {
            if(c == '(') cnt ++;
            else if(c == ')') cnt --;
        }
        return cnt == 0 ? true : false;
    }
}