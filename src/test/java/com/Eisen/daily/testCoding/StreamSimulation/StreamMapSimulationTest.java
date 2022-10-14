package com.Eisen.daily.testCoding.StreamSimulation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamMapSimulationTest {

    @Test
    @DisplayName("123")
    void test() {
        StreamMapSimulation test = new StreamMapSimulation();
        Stream a = test.onlyMapTest("123");
//        a.forEach(System.out::println);
    }

    @Test
    @DisplayName("1321")
    void test2(){

    }
}