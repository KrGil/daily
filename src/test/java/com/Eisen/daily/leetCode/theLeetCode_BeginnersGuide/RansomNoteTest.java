package com.Eisen.daily.leetCode.theLeetCode_BeginnersGuide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void isCreateRansomeNote(){
        RansomNote note = new RansomNote();
        String ransome = "a";
        String magazine = "b";

        System.out.println(note.canConstruct(ransome, magazine));
    }
}