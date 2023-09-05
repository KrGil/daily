package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class $344_ReverseString {
    @Test
    void test(){
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        Assertions.assertArrayEquals(expected, reverseString(input));
    }

//    Input: s = ['h','e','l','l','o']
//    Output: ['o','l','l','e','h']
    public char[] reverseString(char[] s) {
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            System.out.println("c = "+ c);
        }
        return null;
    }
}
