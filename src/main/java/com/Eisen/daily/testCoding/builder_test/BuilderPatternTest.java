package com.Eisen.daily.testCoding.builder_test;

import lombok.Builder;
import lombok.Data;

public class BuilderPatternTest {
    @Data
    @Builder
    static class TestBuilder{
        String a;
        String b;
        String c;
    }

    public void test(){
        TestBuilder test =  TestBuilder.builder().build();

        test.setA("123");
        test.setC("3123");
        System.out.println("test.toString() = " + test.toString());
    }
}
