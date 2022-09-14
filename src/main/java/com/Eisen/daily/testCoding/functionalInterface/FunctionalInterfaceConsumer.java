package com.Eisen.daily.testCoding.functionalInterface;

import java.util.function.Consumer;

public class FunctionalInterfaceConsumer {
    public static void main(String[] args) {
        // lambda
        Consumer<String> consumerLambda = (text) -> consumerMethod(text);
        consumerLambda.accept("Lambda");

        // anonymous
        Consumer<String> consumerAnonymous = new Consumer<String>() {
            @Override
            public void accept(String text) {
                consumerMethod(text);
            }
        };
        consumerAnonymous.accept("Anonymous");

        // andThen
        Consumer<String> consumerAndThen = (text) -> System.out.println("lambda & anonymous");
        consumerLambda.andThen(consumerAndThen).accept("");

    }
    public static <T>void consumerMethod(T text){
        System.out.println("Hello Consumer" + text);
    }
}
