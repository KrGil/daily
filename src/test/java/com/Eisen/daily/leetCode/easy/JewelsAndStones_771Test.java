package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStones_771Test {
    JewelsAndStones_771 test = new JewelsAndStones_771();

    @Test
    @DisplayName("테스트")
    void test() {
        //    jewels = "aA", stones = "aAAbbbb"
        String data1 = "aA";
        String data2 = "aAAbbb";
        test.numJewelsInStones(data1, data2);
        
    }

}