package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String outputString = "";

        System.out.println("Please enter a string");


        String inputString = userInput.nextLine().toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char test = inputString.charAt(i);

            if ((test == 'a') || (test == 'b') || (test == 'c')) {
                outputString += "2";
            } else if ((test == 'd') || (test == 'e') || (test == 'f')) {
                outputString += "3";
            } else if ((test == 'g') || (test == 'h') || (test == 'i')) {
                outputString += "4";
            } else if ((test == 'j') || (test == 'k') || (test == 'l')) {
                outputString += "5";
            } else if ((test == 'm') || (test == 'n') || (test == 'o')) {
                outputString += "6";
            } else if ((test == 'p') || (test == 'q') || (test == 'r') || (test == 's')) {
                outputString += "7";
            } else if ((test == 't') || (test == 'u') || (test == 'v')) {
                outputString += "8";
            } else if ((test == 'w') || (test == 'x') || (test == 'y') || (test == 'z')) {
                outputString += "9";
            } else if (test == ' ') {
                outputString += " ";
            }
        }

        System.out.println(outputString);


    }
}
