package com.tutorial.lambda;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        // Anonimous class
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };

        consumer.accept("Ibad Nurhamim");

        // Lambda
        Consumer<String> consumer1 = value -> System.out.println(value);

        consumer1.accept("Ibad Nurhamim");
    }
}
