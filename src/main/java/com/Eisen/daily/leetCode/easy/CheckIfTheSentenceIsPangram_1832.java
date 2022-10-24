package com.Eisen.daily.leetCode.easy;

import java.util.Arrays;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CheckIfTheSentenceIsPangram_1832
 * author :  eisen
 * date : 2022/10/17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/10/17                eisen             최초 생성
 */
public class CheckIfTheSentenceIsPangram_1832 {
    // "thequickbrownfoxjumpsoverthelazydog"
    public boolean checkIfPangram(String sentence) {
        sentence.chars().distinct().count()
        return Arrays.stream(sentence.split("")).distinct().count() == 26;
    }
}
