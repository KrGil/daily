package com.Eisen.daily.programmers.level0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BabblingTest {
    Babbling test = new Babbling();

    @Test
    void test(){
        String[] testData = {"aya", "yee", "u", "maa"};
        test.solution(testData);
    }

}