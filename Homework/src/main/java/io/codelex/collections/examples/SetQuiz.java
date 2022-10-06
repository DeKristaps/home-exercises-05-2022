package io.codelex.collections.examples;

import java.util.HashSet;
import java.util.Set;

public class SetQuiz {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();

        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        items.add("Apple");

        System.out.println(items);
        // What will be the output?
        // 1. [Apple, Orange, Banana]
        // 2. [Apple, Orange, Banana, Apple]
        // 3. Compilation error
    }
}
