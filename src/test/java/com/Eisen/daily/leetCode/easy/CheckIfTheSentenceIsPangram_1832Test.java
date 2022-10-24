package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : CheckIfTheSentenceIsPangram_1832Test
 * author :  eisen
 * date : 2022/10/17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/10/17                eisen             최초 생성
 */
class CheckIfTheSentenceIsPangram_1832Test {
    CheckIfTheSentenceIsPangram_1832 test = new CheckIfTheSentenceIsPangram_1832();
    @Test
    void test(){
//        "thequickbrownfoxjumpsoverthelazydog"
        System.out.println(test.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}