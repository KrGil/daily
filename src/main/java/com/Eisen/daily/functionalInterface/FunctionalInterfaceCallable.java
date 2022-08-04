package com.Eisen.daily.functionalInterface;

import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.concurrent.Callable;

public class FunctionalInterfaceCallable {
    public static void main(String[] args) {
        Callable callable = () -> callableMethod();
        try {
            System.out.println(callable.call());
        }catch (Exception e){
            ExceptionUtils.getStackTrace(e);
        }
    }
    public static String callableMethod(){
        return "Hello Callable";
    }
}
