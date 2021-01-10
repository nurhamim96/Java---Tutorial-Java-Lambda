package com.tutorial.lambda;

// IMPLEMENTASI LAMBDA INTERFACE / MEMBUAT LAMBDA NYA

public class SimpleActionApp {
    public static void main(String[] args) {

        // Menggunakan anonymous class / sebelum menggunakan lambda
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action() {
                return "Ibad";
            }
        };

        System.out.println(simpleAction1.action());


        // Menggunakan Lambda
        SimpleAction simpleAction2 = () -> {
            return "Ibad";
        };

        System.out.println(simpleAction2.action());


        // Menggunakan Lambda tanpa kurung kurawal
        SimpleAction simpleAction3 = () -> "Ibad";

        System.out.println(simpleAction3.action());


    }
}
