package com.Eisen.daily.testCoding.interfaceTest;

public class TestCompatibility implements TestInterface{

    @Override
    public boolean test(String str) {
        str = "123123";
        return false;
    }
}
