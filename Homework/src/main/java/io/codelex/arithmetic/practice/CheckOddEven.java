package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a integer");
        int inputNumber = userInput.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
