package com.tutorial.lambda;

import com.tutorial.lambda.util.StringUtil;

import java.util.function.Predicate;

// MEMBUAT METHOD REFERENCE STATIC

public class MethodReferenceApp {
    public static void main(String[] args) {

        // Menggunakan Anonomous class
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return StringUtil.isLowerCase(value);
            }
        };

        System.out.println(predicateIsLowerCase.test("ibad"));
        System.out.println(predicateIsLowerCase.test("Ibad"));


        // Menggunakan Lambda
        Predicate<String> predicateIsLowerCaseLambda = value -> StringUtil.isLowerCase(value);

        System.out.println(predicateIsLowerCaseLambda.test("ibad"));
        System.out.println(predicateIsLowerCaseLambda.test("Ibad"));


        // Menggunakan Method Reference
        Predicate<String> predicateIsLowerCaseMethodReference = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCaseMethodReference.test("ibad"));
        System.out.println(predicateIsLowerCaseMethodReference.test("Ibad"));
    }
}
