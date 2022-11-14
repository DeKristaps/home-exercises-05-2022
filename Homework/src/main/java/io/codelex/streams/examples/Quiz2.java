package io.codelex.streams.examples;

import java.util.Arrays;

public class Quiz2 {
    public static void main(String[] args) {
        Arrays.asList(34, 6, 3, 12, 65, 1, 8).stream()
                .filter(n -> n > 5)
                .sorted()
                .forEach(System.out::println);
        // What will be the output?
        // 1. 6 8 12 34 65
        // 2. 34 6 12 65 8
        // 3. 34 6 3 12 65 1 8
        // 4. 1 3 6 8 12 34 65
    }
}
