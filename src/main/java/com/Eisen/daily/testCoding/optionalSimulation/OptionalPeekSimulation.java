package com.Eisen.daily.testCoding.optionalSimulation;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Optional;

import static com.Eisen.daily.testCoding.optionalSimulation.OptionalMapSimulation.*;

public class OptionalPeekSimulation {

    public Pair<String, Optional<TestDTO>> test(String input){
        TestDTO test = new TestDTO();
        test.a = "123";
        return Pair.of(input, Optional.ofNullable(input)
            .map(e -> {
                System.out.println(e);
                test.b = input;
                return test;
            })
        );
    }
}
