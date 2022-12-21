package com.Eisen.daily.leetCode.BinarySearch;

import com.Eisen.daily.leetCode.easy.BinarySearch.BinarySearch_704;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySearch_704Test {
    BinarySearch_704 bs = new BinarySearch_704();

//    nums = [-1,0,3,5,9,12], target = 9
    // output: 4
    @Test
    @DisplayName("BinarySearch_704 테스트")
    void BinarySearchTest() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        bs.search(nums,9);
    }
}