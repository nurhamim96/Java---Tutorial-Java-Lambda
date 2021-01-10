package com.tutorial.lambda;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {

        // Anonimous class
        Predicate<String> predicateCheckBlank = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Ibad"));

        // Lambda
        Predicate<String> predicateCheckBlank1 = value -> value.isBlank();

        System.out.println(predicateCheckBlank1.test(""));
        System.out.println(predicateCheckBlank1.test("Ibad"));
    }
}
