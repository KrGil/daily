package com.Eisen.daily.testCoding.optionalSimulation;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalMapSimulationTest {

    @Test
    void test(){
        OptionalMapSimulation test = new OptionalMapSimulation();
        Pair<String, Optional<OptionalMapSimulation.TestDTO>> prrr = test.simulation("??");
        assertEquals("321", prrr.getRight().get().b);
    }
}