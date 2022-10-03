package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        int upperCaseLetterCounter = 0;

        System.out.println("Please enter a string");
        String input = stringInput.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                upperCaseLetterCounter++;
            }
        }
        System.out.println("The number of uppercase letters in the string you entered is: " + upperCaseLetterCounter);
    }
}
