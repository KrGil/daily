package com.Eisen.daily.testCoding;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTrueFalseSimulationTest {
    PairTrueFalseSimulation test = new PairTrueFalseSimulation();
    @Test
    @DisplayName("성공실패 return 헷갈림.")
    void test(){
//        Pair<String, Boolean> result= test.solution(true);
        Pair<String, Boolean> result= test.solution(false);

        System.out.println(result.getLeft());
        System.out.println(result.getRight() ? 1: 0);
        System.out.println(result.getRight() ? 0: 1);
    }


}