package com.tutorial.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Ibad");
        map.put("name.last", "Nurhamim");

        System.out.println("=============== FOR LOOP =================");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("=============== ANONYMOUS CLASS =================");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        System.out.println("=============== LAMBDA =================");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
