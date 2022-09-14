package com.Eisen.daily.testCoding.functionalInterface.customFuntionalInterface;

@FunctionalInterface
public interface CustomFuntionalInterface<T> {
    T myTest();

    // default method 는 존재해도 상관없음
    default void defalutMethod() {
        System.out.println("Hello Default");
    }

    // static method 는 존재해도 상관없음
    static void staticMethod() {
        System.out.println("Hello Static");
    }
}
