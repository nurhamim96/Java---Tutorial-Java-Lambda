package com.tutorial.lambda;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // Anonimous class
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String value) {
                return value.length();
            }
        };

        System.out.println(functionLength.apply("Ibad"));

        // Lambda
        Function<String, Integer> functionLength1 = value -> value.length();

        System.out.println(functionLength1.apply("Ibad"));
    }
}
