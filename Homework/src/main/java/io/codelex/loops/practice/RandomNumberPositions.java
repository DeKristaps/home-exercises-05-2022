package io.codelex.loops.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;


public class RandomNumberPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] integers = randomIntegers(20);
        System.out.println("There are few integers given: " + Arrays.toString(integers));
        System.out.println("Which number index would you like to find?");

        int searchFor = scanner.nextInt();

        int i;
        boolean foundIt = false;

        for (i = 0; i < integers.length; i++) {
            //todo - search for integer - break when you have found what you searched for
            if (integers[i] == searchFor) {
                foundIt = true;
                break;
            }

        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " is not in the array");
        }
    }

    private static Integer[] randomIntegers(int n) {
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(nextInt(0, 99));
        }
        return list.toArray(new Integer[0]);
    }
}
