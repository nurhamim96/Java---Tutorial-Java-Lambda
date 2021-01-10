package com.tutorial.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Lambda"));


        System.out.println("=============== REMOVE IF ANONYMOUS CLASS =================");
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        System.out.println(names);

        System.out.println("=============== REMOVE IF LAMBDA =================");
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
