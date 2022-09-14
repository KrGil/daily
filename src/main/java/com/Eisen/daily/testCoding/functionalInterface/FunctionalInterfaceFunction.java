package com.Eisen.daily.testCoding.functionalInterface;

import java.util.function.Function;

public class FunctionalInterfaceFunction {
    public static void main(String[] args) {
        // lambda
        Function<Integer, Integer> functionLambda1 = (num) -> num * 2;
        System.out.println(functionLambda1.apply(3));

        Function<String, String> functionLambda2 = (text) -> String.format("똑바로 읽어도 거꾸로 읽어도 %s", text);
        System.out.println(functionLambda2.apply("우영우"));

        Function<Integer, Integer> functionLambda3 = (num) -> num + 3;

        // compose
        Function<Integer, Integer> functionCompose = functionLambda1.compose(functionLambda3);
        System.out.println("functionCompose: "+functionCompose.apply(3));

        // andThen
        Function<Integer, Integer> functionAndThen = functionLambda1.andThen(functionLambda3);
        System.out.println("functionAndThen: "+functionAndThen.apply(3));

        // anonymous
        Function<Integer, Integer> functionAnonymous = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };
        // result
        /*
        6
        똑바로 읽어도 거꾸로 읽어도 우영우
        functionCompose: 12
        functionAndThen: 9
         */
    }
}
