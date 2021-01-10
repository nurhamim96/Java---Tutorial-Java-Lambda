package com.tutorial.lambda;

import com.tutorial.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceNonStaticApp {
    public static void main(String[] args) {
        MethodReferenceNonStaticApp start = new MethodReferenceNonStaticApp();
        start.run();

        // Membuat Method Reference di Perameter Menggunakan Anonimous class
        System.out.println("============= ANONIMOUS CLASS =============");
        Function<String, String> functionToUpper = new Function<String, String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        };

        System.out.println(functionToUpper.apply("ibad"));

        // Membuat Method Reference di Perameter Lambda
        System.out.println("=========== LAMBDA =============");
        Function<String, String> functionToUpperLambda = value -> value.toUpperCase();

        System.out.println(functionToUpperLambda.apply("ibad"));

        // Membuat Method Reference di Perameter Method Reference
        System.out.println("=========== METHOD REFERENCE =============");
        Function<String, String> functionToUpperMethodReference = String::toUpperCase;

        System.out.println(functionToUpperMethodReference.apply("ibad"));
    }

    public void run() {

        // Menggunakan Anonomous class
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return MethodReferenceNonStaticApp.this.isLowerCase(value);
            }
        };

        System.out.println(predicateIsLowerCase.test("ibad"));
        System.out.println(predicateIsLowerCase.test("Ibad"));


        // Menggunakan Lambda
        Predicate<String> predicateIsLowerCaseLambda = value -> MethodReferenceNonStaticApp.this.isLowerCase(value);

        System.out.println(predicateIsLowerCaseLambda.test("ibad"));
        System.out.println(predicateIsLowerCaseLambda.test("Ibad"));

        // Menggunakan Method Reference
//        Predicate<String> predicateIsLowerCaseMethodReference = MethodReferenceNonStaticApp.this::isLowerCase; // cara 1
        Predicate<String> predicateIsLowerCaseMethodReference = this::isLowerCase; // cara 2

        System.out.println(predicateIsLowerCaseMethodReference.test("ibad"));
        System.out.println(predicateIsLowerCaseMethodReference.test("Ibad"));

        // Menggunakan Method Reference menggunakan object orang lain
        MethodReferenceNonStaticApp app = new MethodReferenceNonStaticApp();

        Predicate<String> predicateIsLowerCaseMethodReferenceAnotherObject = app::isLowerCase; // cara 2

        System.out.println(predicateIsLowerCaseMethodReferenceAnotherObject.test("ibad"));
        System.out.println(predicateIsLowerCaseMethodReferenceAnotherObject.test("Ibad"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
