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

            switch (test) {
                case 'a', 'b', 'c':
                    outputString += "2";
                    break;
                case 'd', 'e', 'f':
                    outputString += "3";
                    break;
                case 'g', 'h', 'i':
                    outputString += "4";
                    break;
                case 'j', 'k', 'l':
                    outputString += "5";
                    break;
                case 'm', 'n', 'o':
                    outputString += "6";
                    break;
                case 'p', 'q', 'r', 's':
                    outputString += "7";
                    break;
                case 't', 'u', 'v':
                    outputString += "8";
                    break;
                case 'w', 'x', 'y', 'z':
                    outputString += "9";
                    break;
                default:
                    outputString += " ";

            }
        }
        System.out.println(outputString);
    }
}
