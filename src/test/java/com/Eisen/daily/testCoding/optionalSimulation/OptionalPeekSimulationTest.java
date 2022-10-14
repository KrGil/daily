package com.Eisen.daily.testCoding.optionalSimulation;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalPeekSimulationTest {
    OptionalPeekSimulation test = new OptionalPeekSimulation();
    @Test
    void test(){
        Pair<String, Optional<OptionalMapSimulation.TestDTO>> result = test.test("123");
        System.out.println("result.getRight() = " + result.getRight());
        
    }

}