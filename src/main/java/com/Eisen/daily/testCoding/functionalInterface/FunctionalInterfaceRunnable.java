package com.Eisen.daily.testCoding.functionalInterface;

public class FunctionalInterfaceRunnable {

    public static void runnableMethod(){}

    public static void main(String[] args) {

        Runnable runnableLambda = () -> runnableMethod() ;
        runnableLambda.run();

        Runnable runnableAnonymous = new Runnable() {
            @Override
            public void run() {
                runnableMethod();
            }
        };
    }

}
