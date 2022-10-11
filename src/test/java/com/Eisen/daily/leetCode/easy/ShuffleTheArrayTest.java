package com.Eisen.daily.leetCode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {
    ShuffleTheArray test = new ShuffleTheArray();

    @Test
    void testShuffle(){
//        [2,5,1,3,4,7], n = 3
        int[] testArr1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        test.shuffle(testArr1, n1);
    }

}