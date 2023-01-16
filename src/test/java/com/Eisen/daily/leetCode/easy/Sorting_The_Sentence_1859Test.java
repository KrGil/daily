package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : Sorting_The_Sentence_1859Test
 * author :  eisen
 * date : 2022/11/21
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/11/21                eisen             최초 생성
 */
class Sorting_The_Sentence_1859Test {
    Sorting_The_Sentence_1859 test = new Sorting_The_Sentence_1859();

    @Test
    void test(){
//        "is2 sentence4 This1 a3"
        String input = "is2 sentence4 This1 a3";
        String output = "This is a sentence";
        assertEquals(output, test.sortSentence(input));
    }

}