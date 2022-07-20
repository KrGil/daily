package com.Eisen.daily.leetCode.study_LeetCode75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {
    @Test
    void isomorphicStringTest(){
        IsomorphicStrings test = new IsomorphicStrings();
        // String a = "add", String b = "egg";
//         String a = "foo"; String b = "bar";
         String a = "paper"; String b = "title";
        System.out.println(test.isIsomorphic(a, b));

    }
}