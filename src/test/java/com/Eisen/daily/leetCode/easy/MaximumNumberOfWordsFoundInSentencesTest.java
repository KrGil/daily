package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsFoundInSentencesTest {
    MaximumNumberOfWordsFoundInSentences test = new MaximumNumberOfWordsFoundInSentences();
    @Test
    @DisplayName("2114. Maximum Number of Words Found in Sentences")
    void test1(){
        String[] testData1 ={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println("test.mostWordsFound(testData1) = " + test.mostWordsFound(testData1));
    }



}