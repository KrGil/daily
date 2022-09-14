package com.Eisen.daily.listTest;

import com.Eisen.daily.testCoding.listTest.emptyListTest;
import org.junit.jupiter.api.Test;

class emptyListTestTest {
    @Test
    void emptyListTest(){
        emptyListTest test = new emptyListTest();
        String a = "";
        a = test.testEmpty().isEmpty() ? "empty":  "123";
        System.out.println(a);
    }
}