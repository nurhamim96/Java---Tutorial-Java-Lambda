package com.tutorial.lambda;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Ibad");
        String name = null;
//        sayHello(name);
    }

    public static void sayHello(String name) {

        Optional<String> optionalName = Optional.ofNullable(name);

        // UpperCase Menggunakan Anonymous Class
//        System.out.println("============= OPTIONAL DAN ANONYMOUS CLASS ==============");
        Optional<String> optionalNameUpper = optionalName.map(new Function<String, String>() {
            @Override
            public String apply(String name) {
                return name.toUpperCase();
            }
        });

//        System.out.println("HELLO " + optionalNameUpper);
        optionalNameUpper.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println("HELLO " + value + " Aja");
            }
        });

        // UpperCase Menggunakan Lambda
//        System.out.println("============= OPTIONAL DAN LAMBDA ==============");
        Optional<String> optionalNameUpperLambda = optionalName.map(value -> value.toUpperCase());
        optionalNameUpperLambda.ifPresent(value -> System.out.println("HELLO " + value + " Wae"));
//        System.out.println("HELLO " +optionalNameUpperLambda);


        // UpperCase Menggunakan Method Reference
//        System.out.println("============= OPTIONAL DAN METHOD REFERENCE ==============");
        Optional<String> optionalNameUpperMethodReference = optionalName.map(String::toUpperCase);
        optionalNameUpperMethodReference.ifPresent(value -> System.out.println("HELLO " + value + " Lagi"));
//        System.out.println("HELLO " +optionalNameUpperMethodReference);

        // UpperCase Optional di Gabung dan Pake Lambda (Jalan Ninja :-> )
        Optional.ofNullable(name)
                .map(value -> value.toUpperCase())
                .ifPresent(value -> System.out.println("HELLO " + value  + ", Apa Kabar?"));

        // UpperCase Optional di Gabung, Pake Lambda dan Method Reference (Jalan Ninja :-> )
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(value -> System.out.println("HELLO " + value  + ", Kumaha Kabarna?"));

        // UpperCase Optional di Gabung, Pake Lambda dan Method Reference ganti ifPresent() jadi ifPresentOrElse jika datanya NULL tetap ditampilkan(Jalan Ninja :-> )
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("HELLO " + value  + ", Apa Kabar bosque? ini yang pake ifPresentOrElse()"),
                        ()-> System.out.println("HELLO KAWAN. ini yang pake ifPresentOrElse()"));

        // UpperCase Optional di Gabung, Pake Lambda dan Method Reference menggunakkan orElse() jika ingin menampilkan data yang NULL nya aja (Jalan Ninja :-> )
        String upperName =  Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN BAIK");
        System.out.println("HELLO " + upperName);

        // Cek manual
        if (name != null) {
            String nameUpper = name.toUpperCase();
            System.out.println("HELLO " + nameUpper + " Terus");
        }

//        String nameUpper = name.toUpperCase(); ERROR
//        System.out.println("HELLO " + nameUpper); // ERROR
    }
}

/*
    NOTE : - map() -> mentransform suatu object ke object lainnya (me mapping/merubah satu").
           - ifPresentOrElse anda harus memasukkan dua parameter seperti contoh diatas.
 */