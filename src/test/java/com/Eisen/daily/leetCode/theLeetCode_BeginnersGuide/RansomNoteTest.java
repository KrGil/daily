package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void isCreateRansomeNote(){
        RansomNote note = new RansomNote();
        String ransome = "aab";
        String magazine = "baa";

        System.out.println(note.canConstruct(ransome, magazine));
    }
}