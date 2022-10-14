package com.Eisen.daily.testCoding.StreamSimulation;

import com.Eisen.daily.testCoding.optionalSimulation.OptionalMapSimulation.TestDTO;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapSimulation {
    public Stream onlyMapTest(String input){
        TestDTO testDto = new TestDTO();
        testDto.a = "123";

        return Stream.of(input)
            .peek(e -> System.out.println(e))
            .map(e -> {
                testDto.b = "done";
                return testDto;
            });
    }

}
