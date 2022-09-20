package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner userInputs = new Scanner(System.in);
        System.out.println("Please input two integers");
        int firstInt = userInputs.nextInt();
        int secondInt = userInputs.nextInt();

        if ((firstInt  == 15) || (secondInt == 15) || (firstInt + secondInt == 15) || (firstInt - secondInt == 15)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
