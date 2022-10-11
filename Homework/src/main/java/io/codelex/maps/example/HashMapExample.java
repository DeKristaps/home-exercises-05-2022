package io.codelex.maps.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Audi");
        myMap.put(2, "BMW");
        myMap.put(5, "Lexus");
        myMap.put(6, "BMW");

        System.out.println(myMap.get(1));
        System.out.println(myMap.get(2));
    }

}
