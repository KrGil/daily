package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAString_151Test {
    ReverseWordsInAString_151 test = new ReverseWordsInAString_151();

    @Test
    void firstTest() {
        String str = "the sky is blue";
        System.out.println(test.reverseWords(str));
    }
}