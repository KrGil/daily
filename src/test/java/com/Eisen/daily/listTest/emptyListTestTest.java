package com.Eisen.daily.listTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class emptyListTestTest {
    @Test
    void emptyListTest(){
        emptyListTest test = new emptyListTest();
        String a = "";
        a = test.testEmpty().isEmpty() ? "empty":  "123";
        System.out.println(a);
    }
}