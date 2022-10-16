package com.Eisen.daily.leetCode.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class KidsWithTheGreatestNumberOfCandies_1431Test {
    KidsWithTheGreatestNumberOfCandies_1431 test = new KidsWithTheGreatestNumberOfCandies_1431();

    @Test
    void test(){
        int[] testArr = {2, 3, 5, 1, 3};
        int testInt = 3;

        log.info("{}",test.kidsWithCandies(testArr, testInt));
    }

}