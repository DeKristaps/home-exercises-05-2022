package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);


        while (true) {
            int divisor = 0;
            int numerator = 0;
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);

            } catch (ArithmeticException exception) {
                System.out.println("You can't divide " + numerator + " by " + divisor);
            } catch (NumberFormatException | InputMismatchException exception) {
                String wrongInput = scanner.nextLine();
                if (wrongInput.charAt(0) == 'q' || wrongInput.charAt(0) == 'Q') {
                    break;
                }
                System.out.print("""
                        You entered bad data.
                        Please try again.
                        """);

            }
        }
    }
}
