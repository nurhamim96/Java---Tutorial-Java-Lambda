package com.tutorial.lambda;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // Anonimous class
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Ibad Nurhamim";
            }
        };

        System.out.println(supplier.get());

        // Lambda
        Supplier<String> supplier1 = () -> "Ibad Nurhamim";

        System.out.println(supplier1.get());
    }
}
