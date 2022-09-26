package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationOfArray1929Test {
    @Test
    @DisplayName("solution이 잘 돌아가는지 확인")
    void solution() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ConcatenationOfArray1929 test = new ConcatenationOfArray1929();
        int[] testN1 = {1, 2, 3};
        test.getConcatenation(testN1);
    }
}