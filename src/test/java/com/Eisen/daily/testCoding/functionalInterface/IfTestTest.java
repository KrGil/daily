package com.Eisen.daily.testCoding.functionalInterface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IfTestTest {
    IfTest test = new IfTest();

    @Test
    void run() {
        String str = "String1";
        System.out.println(test.run(str));
    }

    @Test
    void ifTest() {
    }
}