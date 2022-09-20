package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        String choice = "y";

        while (!choice.equals("n")) {

        String currentWord = randomString();
        char[] splitCopy = currentWord.toCharArray();
        char[] guess = new char[21];
        char[] miss = new char[5];
        String output = "";


        int guessIndex = 0;
        int missIndex = 0;

        Arrays.fill(guess, ' ');
        Arrays.fill(miss, ' ');
        Arrays.fill(splitCopy, '-');

        while (!winCondition(splitCopy)) {

            gameField(splitCopy, guess, miss);

            System.out.println("Please enter a letter: ");
            String userGuess = keyBoard.nextLine();


            int index = currentWord.indexOf(userGuess);
            if (index != -1) {
                while (index != -1) {
                    splitCopy[index] = userGuess.charAt(0);
                    index = currentWord.indexOf(userGuess, index + 1);
                }

            } else {
                miss[missIndex] = userGuess.charAt(0);
                missIndex++;
            }

            guess[guessIndex] = userGuess.charAt(0);
            guessIndex++;

            gameField(splitCopy, guess, miss);

            if (winCondition(splitCopy)) {
                output = "You did it!";
                break;
            }
            if (missIndex == 5) {
                output = "You lost!";
                break;
            }

        }

        System.out.println(output);
            System.out.println("Do you want to play again? y/n:");
            choice = keyBoard.nextLine();
    }

}

    public static void gameField(char[] currentWord, char[] guess, char[] mises) {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println(" Word    : " + output(currentWord));
        System.out.println();
        System.out.println(" Misses  : " + output(mises));
        System.out.println();
        System.out.println(" Guesses : " + output(guess));
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static String randomString() {
        Random number = new Random();
        String[] words = {"cellulose", "concrete", "java", "codelex", "guitar", "republic", "phone"};

        return words[number.nextInt(0, words.length)];

    }

    public static boolean winCondition(char[] splitCopy) {
        boolean win = false;
        if (Arrays.toString(splitCopy).contains("-")) {
        } else {
            win = true;
        }
        return win;
    }

    public static String output(char[] output) {
        StringBuilder display = new StringBuilder();

        for (int i = 0; i < output.length; i++) {
            display.append(output[i]).append(" ");
        }

        return display.toString();

    }

}
