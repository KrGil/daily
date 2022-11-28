package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitAStringInBalancedStrings_1221Test {

    SplitAStringInBalancedStrings_1221 test = new SplitAStringInBalancedStrings_1221();

    @Test
    void test(){
        assertEquals(4, test.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2, test.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(1, test.balancedStringSplit("LLLLRRRR"));

    }
}