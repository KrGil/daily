package com.Eisen.daily.leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.Eisen.daily.leetCode.medium
 * fileName : GasStation_134Test
 * author :  eisen
 * date : 2023/01/07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/01/07                eisen             최초 생성
 */
class GasStation_134Test {
    GasStation_134 test = new GasStation_134();
    @Test
    void test(){
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        test.canCompleteCircuit(gas, cost);
    }
}