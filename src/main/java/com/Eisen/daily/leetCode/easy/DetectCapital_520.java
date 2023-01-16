package com.Eisen.daily.leetCode.easy;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : DetectCapital_520
 * author :  eisen
 * date : 2023/01/02
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/02                eisen             최초 생성
 */
public class DetectCapital_520 {
    public boolean detectCapitalUse(String word) {
        int capitalCnt = 0;
        for (char c : word.toCharArray()) {
            if(c <= 'Z')
                capitalCnt++;
        }
        if(capitalCnt == word.length()) return true;
        if(capitalCnt == 0) return true;
        if(capitalCnt == 1 && word.charAt(0) <= 'Z') return true;
        return false;
    }
}
