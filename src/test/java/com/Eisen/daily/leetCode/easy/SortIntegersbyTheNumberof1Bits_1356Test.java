package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.easy
 * fileName : SortIntegersbyTheNumberof1Bits_1356Test
 * author : eisen
 * date : 2023-01-10
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-10    AUTHOR: eisen    NOTE: 최초 생성
 */
class SortIntegersbyTheNumberof1Bits_1356Test {
    SortIntegersbyTheNumberof1Bits_1356 test = new SortIntegersbyTheNumberof1Bits_1356();

    @Test
    void test(){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] expect = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
//        assertArrayEquals(expect, test.sortByBits(arr1));
//        assertArrayEquals(expect, test.sortByBits(arr));
        test.sortByBits(arr);
    }
}