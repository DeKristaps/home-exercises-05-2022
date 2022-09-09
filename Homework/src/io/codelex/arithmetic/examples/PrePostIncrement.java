package io.codelex.arithmetic.examples;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 21;
        int b = 35;
        int sum = a++ + ++b;
        System.out.println("sum = " + sum);
        // 1. 56
        // 2. 57
        // 3. 58
        // 4. compilation error
    }
}
