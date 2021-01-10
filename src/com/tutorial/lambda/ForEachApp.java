package com.tutorial.lambda;

import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String> list = List.of("Ibad", "Nurhamim", "Sedang", "Belajar", "Lambda");

        System.out.println("============= FOR LOOP ==============");
        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("============= FOREACH ANONYMOUS CLASS ==============");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        System.out.println("============= LAMBDA ==============");
        list.forEach(value -> System.out.println(value));

        System.out.println("============= LAMBDA METHOD REFERENCE ==============");
        list.forEach(System.out::println);
    }
}
