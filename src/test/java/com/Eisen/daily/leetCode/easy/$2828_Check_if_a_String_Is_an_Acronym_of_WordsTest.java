package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class $2828_Check_if_a_String_Is_an_Acronym_of_WordsTest {
    $2828_Check_if_a_String_Is_an_Acronym_of_Words test = new $2828_Check_if_a_String_Is_an_Acronym_of_Words();

    @Test
    void test(){
        List<String> words =  List.of("alice","bob","charlie");
        String s = "abc";
        Assertions.assertTrue(test.isAcronym(words, s));
    }
}