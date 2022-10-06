package io.codelex.collections.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean loop = true;
        int sum = 0;
        final int UNHAPPY = 4;

        System.out.println("Please enter a number");
        String input = userInput.nextLine();
        int[] numbers = convertToIntArr(input);

        while (loop) {

            for (int i = 0; i < numbers.length; i++) {
                sum += Math.pow(numbers[i], 2);
            }
            if (sum == 1) {
                System.out.println("Number is happy");
                break;
            } else if (sum == UNHAPPY) {
                System.out.println("This is not a happy number");
                break;
            }

            numbers = convertToIntArr(String.valueOf(sum));
            sum = 0;
        }
    }

    public static int[] convertToIntArr(String string) {
        return Arrays.stream(string.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
