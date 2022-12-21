package com.Eisen.daily.programmers.level0;

import java.util.stream.IntStream;

public class ConditionOfTriangle {
    public int solution(int[] sides) {
//        가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.

        int max = IntStream.of(sides).max().orElse(0);
        return max < IntStream.of(sides).sum() - max? 1 : 2;
    }

}
