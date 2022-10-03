package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {

    private static final DecimalFormat formating = new DecimalFormat("0.00");

    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        double height =  74 * 2.57;  // inches converted to cm
        double weight = 180 * 0.453592; // lbs converted to kg
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f centimeters tall.\n",height );
        System.out.printf("He's %.2f kilograms heavy.\n", weight);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + formating.format(height) + ", and " + formating.format(weight)
                + " I get " + formating.format(age + height + weight) + ".");
    }
}