package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random roller = new Random();

        String userChoice;
        int finalScore = 0;
        int roll;

        System.out.println("Welcome to Piglet!");


        do {
            roll = roller.nextInt(1, 7);

            if (roll == 1) {
                finalScore = 0;
                System.out.println("You rolled a 1 and your final score is " + finalScore);
                break;

            }
            finalScore = finalScore + roll;
            System.out.println("You rolled a " + roll + " Do you want to continue? y/n");
            userChoice = userInput.next().toLowerCase();

        } while (userChoice.equals("y"));

        if (finalScore != 0) {
            System.out.println("Your final score is: " + finalScore);
        }
    }
}
