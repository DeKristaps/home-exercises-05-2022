package io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput("");
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NonPositiveNumberException e) {
            System.out.println("Enter a positive number");
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }
    }

    static double getInput(String s) {
        double d = Double.parseDouble(s);
        if (d < 0) {
            throw new NonPositiveNumberException("Error");
        }
        return d;
    }
}
