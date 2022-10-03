package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input your weight in Kg");
        double weightInKg = userInput.nextDouble();

        System.out.println("Pleas input your height in Cm");
        double heightInCm = userInput.nextInt();

        double weightInPounds = weightInKg * 2.204;
        double heightInInches = heightInCm * 0.393;

        double bMI = (weightInPounds * 703) / (Math.pow(heightInInches,2));

        if (bMI < 18.5){
            System.out.println("Your BMI is "+ bMI +". You are considered underweight");
        } else if(bMI > 25){
            System.out.println("Your BMI is "+ bMI +". You are considered overweight");
        } else {
            System.out.println("Your BMI is "+ bMI +". You are at your optimal eight");
        }


    }
}
