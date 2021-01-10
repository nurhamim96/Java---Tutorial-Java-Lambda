package com.tutorial.lambda;

public class SimpleAppWithParameter {
    public static void main(String[] args) {

        // Menggunakan anonymous class / sebelum menggunakan lambda
        SimpleActionWithParameter simpleActionWithParameter1 = new SimpleActionWithParameter() {
            @Override
            public String action(String name) {
                return name;
            }
        };

        System.out.println(simpleActionWithParameter1.action("Ibad Nurhamim"));

        // Menggunakan Lambda
        SimpleActionWithParameter simpleActionWithParameter2 = (String name) -> {
            return "Hello " + name;
        };

        System.out.println(simpleActionWithParameter2.action("Ibad Nurhamim"));

        // Menggunakan Lambda tanpa tipe data String
        SimpleActionWithParameter simpleActionWithParameter3 = (name) -> {
            return "Hello " + name;
        };

        System.out.println(simpleActionWithParameter2.action("Ibad Nurhamim"));

        // Menggunakan Lambda tanpa kurung kurawal dan return
        SimpleActionWithParameter simpleActionWithParameter4 = name -> "Hello" + name;

        System.out.println(simpleActionWithParameter2.action("Ibad Nurhamim"));
    }

}

// NOTE : tipe data String yang ada di simpleActionWithParameter2 sebenernya optional bisa ditambahkan atau nggak, contohnya yang dibawahnya.