package com.Eisen.daily.leetCode.easy;

import com.tistory.eisen.Eisen;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class NumberOfGoodPairs_1512Test {

    NumberOfGoodPairs_1512 test = new NumberOfGoodPairs_1512();

    @Data
    class QWEQWEP{
        String a;
    }
    @Test
    @DisplayName("릿코드 테스트")
    void test(){
        int[] testData = {1, 2, 3, 1, 1, 3};
        log.info("123");
//        test.numIdenticalPairs(testData);
        logMeasuredExecutionTime(e -> test.numIdenticalPairs(e), testData);
        Eisen.logMeasuredExecutionTime(e -> test.numIdenticalPairs(e), testData);
    }
    @Test
    @DisplayName("릿코드 테스트")
    void test2(){
        int[] testData = {1, 2, 3, 1, 1, 3};
        log.info("{}",test.numIdenticalPairs2(testData));
//        test.numIdenticalPairs(testData);
        Eisen.logMeasuredExecutionTime(NumberOfGoodPairs_1512::numIdenticalPairs2, testData);
    }

    public static <T> void logMeasuredExecutionTime(Consumer<T> func, T request) {
        long startTime = System.currentTimeMillis();

        try {
            func.accept(request);
        } finally {
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println(String.format("실행시간 => %d mes", elapsedTime));
        }

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println(String.format("실행시간 => %d mes", elapsedTime));
    }


}