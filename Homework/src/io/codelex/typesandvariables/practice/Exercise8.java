package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner timeInput = new Scanner(System.in);

        System.out.println("Please enter amount of minutes you would like to convert in to days and years");
        int minutes = timeInput.nextInt();

        int days = minutes / 1440; // 1440 is the number of minutes in a day.
        int years = minutes / 525600;  // 525 600 is the amount of minutes in a year

        System.out.printf("%d is equivalent to %d days and %d years \n", minutes, days, years);
    }
}
