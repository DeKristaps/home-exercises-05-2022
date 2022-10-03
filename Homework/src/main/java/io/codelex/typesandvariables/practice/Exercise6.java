package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        int sumOfInputtedNumbers = 0;
        int input;
        System.out.println("Please enter a single digit number");

        do {
            input = integerInput.nextInt();
            if (input == 666) {
                break;
            } else if ((input > 9) || (input < -9)) {
                System.out.printf("%d, is not a single digit number. Please enter a single digit number!\n", input);
            } else {
                sumOfInputtedNumbers += input;
                System.out.println("Please enter another number. (If you wish to quit and see the sum, enter 666)");
            }

        } while (input != 666);
        System.out.println("The sum of entered numbers is: " + sumOfInputtedNumbers);

    }
}
