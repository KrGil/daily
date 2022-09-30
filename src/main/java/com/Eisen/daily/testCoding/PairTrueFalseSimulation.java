package com.Eisen.daily.testCoding;

import org.apache.commons.lang3.tuple.Pair;

public class PairTrueFalseSimulation {
    public Pair<String, Boolean> solution(boolean flag){
        if (flag) {
            return Pair.of("성공했을 시", true);
        } else {
            return Pair.of("실패했을 시", false);
        }
    }
}
