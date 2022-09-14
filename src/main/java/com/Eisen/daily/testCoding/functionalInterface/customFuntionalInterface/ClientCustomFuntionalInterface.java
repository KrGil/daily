package com.Eisen.daily.testCoding.functionalInterface.customFuntionalInterface;

public class ClientCustomFuntionalInterface {
    public static void main(String[] args) {
        CustomFuntionalInterface test = new CustomFuntionalInterface() {
            @Override
            public String myTest() {
                return "Hello Abstract";
            }
        };

        CustomFuntionalInterface lambdaTest = () -> "Hello Abstract";

        // abstract 메서드
        System.out.println(lambdaTest.myTest());

        // default 메서드
        lambdaTest.defalutMethod();

        // static 메서드
        CustomFuntionalInterface.staticMethod();
    }
}
