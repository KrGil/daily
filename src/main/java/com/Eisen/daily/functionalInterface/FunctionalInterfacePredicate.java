package com.Eisen.daily.functionalInterface;

import java.util.function.Predicate;

public class FunctionalInterfacePredicate {
    public static void main(String[] args) {
        // lambda
        Predicate<String> predicateLambda = (text) -> predicateMethod(text);
        String text = "Predicate";

        // anonymous
        Predicate<String> predicateAnonymous = new Predicate<String>() {
            @Override
            public boolean test(String text) {
                return predicateMethod(text);
            }
        };

        // test
        System.out.println("[Lambda] testTest: "+predicateLambda.test(text));
        System.out.println("[anonymous] testTest: "+predicateLambda.test(text));

        // negate
        System.out.println("negateTest: "+predicateLambda.negate().test(text));

        Predicate<String> predicateInteger = num -> predicateMethod2(text);
        // and
        System.out.println("andTest: "+predicateLambda.and(predicateInteger).test("Predicate"));

        // or
        System.out.println("orTest: "+predicateLambda.test("Predicate"));

        // isEqual(static method)
        Predicate<String> predicateIsEqual = Predicate.isEqual("isEqual?!");
        System.out.println("isEqualTest: "+predicateIsEqual.test("isEqual?!"));

        // not(static method)
        Predicate<String> predicateNot = Predicate.not(predicateIsEqual);
        System.out.println("notTest: "+ predicateNot.test("isEqual?!"));

    }
    public static <T> boolean predicateMethod(T req) {
        return req.equals("Predicate") ? true : false;
    }
    public static <T> boolean predicateMethod2(T req){
        return req.equals("Predicate2") ? true : false;
    }
}
