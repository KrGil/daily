package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleString_1528Test {
    ShuffleString_1528 test = new ShuffleString_1528();

    @Test
    void test(){
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println("test.restoreString(s, indices) = " + test.restoreString(s, indices));
    }

}