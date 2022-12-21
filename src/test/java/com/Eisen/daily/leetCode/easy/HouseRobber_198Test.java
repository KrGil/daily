package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber_198Test {
    HouseRobber_198 test = new HouseRobber_198();
    @Test
    void test(){
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,7,9,3,1};
        assertEquals(4, test.rob(nums1));
        assertEquals(12, test.rob(nums2));
    }
}