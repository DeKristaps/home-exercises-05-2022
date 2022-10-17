package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        int[] randomIntArray = new int[10];
        int[] copyArray;
        Random numberGenerator = new Random();

        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = numberGenerator.nextInt(1, 101);
        }

        copyArray = Arrays.copyOfRange(randomIntArray, 0, randomIntArray.length);

        randomIntArray[randomIntArray.length - 1] = -7;

        System.out.println(output("Array 1", randomIntArray));
        System.out.println(output("Array 2", copyArray));

    }

    private static StringBuilder output(String arrayName, int[] array) {
        StringBuilder output = new StringBuilder();
        output.append(arrayName).append(" :");

        for (int j = 0; j < array.length; j++) {
            output.append(" ").append(array[j]);
        }

        return output;
    }
}
