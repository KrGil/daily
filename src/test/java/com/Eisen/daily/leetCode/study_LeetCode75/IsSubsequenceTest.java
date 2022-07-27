package com.Eisen.daily.leetCode.study_LeetCode75;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    void isSubsequenceTest(){
        IsSubsequence test = new IsSubsequence();
        String s = "axc";
        String t = "aexec";
        // ""
        // "ahbgdc"
        System.out.println(test.isSubsequence(s, t));
    }
}