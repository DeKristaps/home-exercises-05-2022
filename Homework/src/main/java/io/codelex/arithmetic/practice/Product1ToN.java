package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of 10 = " + factorial);
    }
}
