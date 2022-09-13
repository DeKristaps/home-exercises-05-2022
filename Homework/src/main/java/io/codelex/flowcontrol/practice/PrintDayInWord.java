package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = userInput.nextInt();

        System.out.println(nestedIf(num));
        System.out.println(switchStatement(num));
    }

    public static String nestedIf(int num) {

        if ((num > 0) && (num <= 7)) {
            if (num == 1) {
                return "Monday";
            } else if (num == 2) {
                return "Tuesday";
            } else if (num == 3) {
                return "Wednesday";
            } else if (num == 4) {
                return "Thursday";
            } else if (num == 5) {
                return "Friday";
            } else if (num == 6) {
                return "Saturday";
            } else {
                return "Sunday";
            }
        } else {
            return "Not a valid day";
        }


    }

    public static String switchStatement(int num) {

        switch (num) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

            default:
                return "Nota a valid day";
        }
    }
}
