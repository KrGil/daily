package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecompressRunLengthEncodedList_1313Test {
    DecompressRunLengthEncodedList_1313 test = new DecompressRunLengthEncodedList_1313();

    @Test
    void test(){
//        int[] testData = {1, 2, 3, 4};
        int[] testData = {1, 1, 2, 3};
        test.decompressRLElist(testData);
    }

}