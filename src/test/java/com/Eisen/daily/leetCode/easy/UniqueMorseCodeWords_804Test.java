package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.easy
 * fileName : UniqueMorseCodeWords_804Test
 * author :  eisen
 * date : 2023/01/20
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/20                eisen             최초 생성
 */
class UniqueMorseCodeWords_804Test {
    UniqueMorseCodeWords_804 test = new UniqueMorseCodeWords_804();

    @Test
    void test(){
        String[] words = {"gin", "zen", "gig", "msg"};
        String[] words1 = {"a"};
        assertEquals(2, test.uniqueMorseRepresentations(words));
        assertEquals(1, test.uniqueMorseRepresentations(words1));
    }
}