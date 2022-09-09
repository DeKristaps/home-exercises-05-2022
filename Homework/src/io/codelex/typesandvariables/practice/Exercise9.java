package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input the distance in meters:");
        float distance = userInput.nextFloat();

        System.out.println("Please input hours:");
        float hours = userInput.nextFloat();

        System.out.println("Please input minutes:");
        float minutes = userInput.nextFloat();

        System.out.println("Please input seconds:");
        float seconds = userInput.nextFloat();

        float totalSeconds = ((hours * 60) * 60) + (minutes * 60) + seconds;
        float metersPerSecond = distance / totalSeconds;
        float kilometersPerHour = (distance / 1000f) / (totalSeconds / 3600f);
        float milesPerHour = kilometersPerHour / 1.609f;

        System.out.printf("Your speed in meters / second = %.8f \n", metersPerSecond);
        System.out.printf("Your speed in kilometers / hour = %.8f \n", kilometersPerHour);
        System.out.printf("Your speed in miles / hour = %.8f \n", milesPerHour);

    }
}
