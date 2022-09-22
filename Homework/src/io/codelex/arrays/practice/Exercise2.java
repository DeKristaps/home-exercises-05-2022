package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int arrayLength = (maxNumber - minNumber) + 1;
        int[] myArray = new int[arrayLength];
        int sum = 0;

        // Generates the array and sums up the members.
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = minNumber;
            minNumber++;
            sum += myArray[i];
        }
        System.out.println("The generated arrays is: " + Arrays.toString(myArray));
        System.out.println("And the sum of its members is:  " + sum);
    }
}
