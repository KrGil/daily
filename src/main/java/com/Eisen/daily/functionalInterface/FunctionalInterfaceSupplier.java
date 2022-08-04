package com.Eisen.daily.functionalInterface;

import java.util.function.Supplier;

public class FunctionalInterfaceSupplier {
    public static void main(String[] args) {
        // lambda
        Supplier<String> supplierLambda = () -> "Hello SupplierLambda";
        System.out.println("supplierLambda = " + supplierLambda.get());

        // annonymous
        Supplier<String> supplierAnnonymous = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello SupplierAnnoymous";
            }
        };
        System.out.println("supplierAnnoymous = " + supplierAnnonymous.get());
    }

}
