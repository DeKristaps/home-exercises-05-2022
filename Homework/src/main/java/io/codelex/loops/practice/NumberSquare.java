package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a min value: ");
        int min = userInput.nextInt();
        System.out.println("Please enter a max value: ");
        int max = userInput.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int k = 0; k < i - min; k++) {
                System.out.print(min + k);
            }
            System.out.println();
        }
    }
}
