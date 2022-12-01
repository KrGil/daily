package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Determine_If_String_Halves_Are_Alike_1704Test {
    Determine_If_String_Halves_Are_Alike_1704 test = new Determine_If_String_Halves_Are_Alike_1704();

    @Test
    void test(){
        String testData = "book";
        assertTrue(test.halvesAreAlike(testData));
        assertTrue(test.halvesAreAlikeSet(testData));

        testData = "textBook";
        assertFalse(test.halvesAreAlike(testData));
        assertFalse(test.halvesAreAlikeSet(testData));

    }
}