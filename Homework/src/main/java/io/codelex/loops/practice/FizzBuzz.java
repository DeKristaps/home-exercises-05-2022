package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = userInput.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("FizBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }

        }

    }
}
