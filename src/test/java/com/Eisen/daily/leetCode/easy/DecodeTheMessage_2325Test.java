package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTheMessage_2325Test {
    DecodeTheMessage_2325 test = new DecodeTheMessage_2325();

    @Test
    void test(){
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        test.decodeMessage(key, message);
    }
}