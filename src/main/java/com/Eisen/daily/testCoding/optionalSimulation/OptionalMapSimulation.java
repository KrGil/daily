package com.Eisen.daily.testCoding.optionalSimulation;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Map;
import java.util.Optional;

public class OptionalMapSimulation {
    public static class TestDTO{
        String a;
        String b;
    }
    public Pair<String, Optional<TestDTO>> simulation(String input) {
        TestDTO testDTO = new TestDTO();
        testDTO.a = "123";
        return Pair.of("??",
            Optional.ofNullable(input)
                .map(e -> {
                    testDTO.b = "321";
                    return testDTO;
                }));
    }
}
