package com.Eisen.daily.testCoding.optionalSimulation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OptionalFilterSimulationTest {
    OptionalFilterSimulation test = new OptionalFilterSimulation();

    @Test
    @DisplayName("실패 3회 이하")
    void test1(){
        String result = test.test("N", 3);
        Assertions.assertEquals("N", result);
    }
    @Test
    @DisplayName("실패 4회 이상")
    void test2(){
        String result = test.test("N", 4);
        Assertions.assertEquals("F", result);
    }
    @Test
    @DisplayName("성공 3회 이하")
    void test3(){
        String result = test.test("Y", 3);
        Assertions.assertEquals("Y", result);
    }
    @Test
    @DisplayName("성공 4회 이상")
    void test4(){
        String result = test.test("Y", 3);
        Assertions.assertEquals("Y", result);
    }
    @Test
    @DisplayName("NULL 일 시")
    void test5(){
        String result = test.test(null, 3);
        Assertions.assertEquals("널안됨", result);
    }

}