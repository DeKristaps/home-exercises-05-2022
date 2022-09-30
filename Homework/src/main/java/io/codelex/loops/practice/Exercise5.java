package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        final int LINE_LENGTH = 30;
        Scanner userInput = new Scanner(System.in);
        StringBuilder dots = new StringBuilder();

        System.out.println("Please enter the first word");
        String firstInput = userInput.nextLine();
        System.out.println("Please enter the second word");
        String secondInput = userInput.nextLine();

        int dodLength = firstInput.length() + secondInput.length();

        for (int i = 0; i < LINE_LENGTH - dodLength; i++) {
            dots.append(".");
        }

        System.out.println(firstInput + dots + secondInput);
    }
}
