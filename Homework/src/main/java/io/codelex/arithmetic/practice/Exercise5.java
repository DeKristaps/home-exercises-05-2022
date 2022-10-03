package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);
        Random target = new Random();

        int randomInt = target.nextInt(100) + 1;

        System.out.println("Im thinking of a number form 1 to 100. Care to take a guess?");
        int guess = userGuess.nextInt();

        if (guess == randomInt) {
            System.out.println("Wow! You got it!");
        } else if (guess > randomInt) {
            System.out.println("Too high. I was thinking of " + randomInt);
        } else {
            System.out.println("Too low. I was thinking of " + randomInt);
        }
    }
}
