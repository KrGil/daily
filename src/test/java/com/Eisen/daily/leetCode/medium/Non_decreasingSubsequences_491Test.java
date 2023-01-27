package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.Eisen.daily.leetCode.medium
 * fileName : Non_decreasingSubsequences_491Test
 * author : eisen
 * date : 2023-01-20
 * description :
 * <p>
 * -----------------------------------------------------
 * DATE: 2023-01-20    AUTHOR: eisen    NOTE: 최초 생성
 */
class Non_decreasingSubsequences_491Test {
    Non_decreasingSubsequences_491 test = new Non_decreasingSubsequences_491();

    @Test
    void test(){
        int[] nums = {4,6,7,7};
//        Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
        List<List<Integer>> expect =  List.of(List.of(4,6),List.of(4,6,7),List.of(4,6,7,7),List.of(4,7),List.of(4,7,7),List.of(6,7),List.of(6,7,7),List.of(7,7));
        assertEquals(expect, test.findSubsequences(nums));
    }
}