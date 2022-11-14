package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int d1 = 0;
        int d2 = 0;
        int diceSum;


        System.out.println("Please enter your desired sum:");
        int desiredSum = userInput.nextInt();

        // Tests if the entered sum can be rolled on 2 dice
        if ((desiredSum < 2) || (desiredSum > 12)) {
            do {
                System.out.println("You cant get that on 2 dice. Try again");
                desiredSum = userInput.nextInt();

            } while ((desiredSum < 2) || (desiredSum > 12));
        }

        do {
            d1 = rollDice();
            d2 = rollDice();
            diceSum = d1 + d2;

            System.out.println(d1 + " and " + d2 + " = " + diceSum);

        } while (desiredSum != diceSum);

    }

    public static int rollDice(){
        Random dice = new Random();
        return dice.nextInt(1, 7);
    }
}
