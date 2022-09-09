package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        String printStatement;


        for (int i = 1; i <= 110; i++) {

            if ((i % 7 == 0) && (i % 5 == 0)) {
                printStatement = ("LozaWoza ");

            } else if ((i % 7 == 0) && (i % 3 == 0)) {
                printStatement = ("CozaWoza ");

            } else if ((i % 5 == 0) && (i % 3 == 0)) {
                printStatement = ("CozaLoza ");

            } else if (i % 3 == 0) {
                printStatement = ("Coza ");

            } else if (i % 5 == 0) {
                printStatement = ("Loza ");

            } else if (i % 7 == 0) {
                printStatement = ("Woza ");

            } else {
                printStatement = (i + " ");
            }

            if (i % 11 == 0) {
                System.out.println(printStatement);
            } else {
                System.out.print(printStatement);
            }
        }
    }
}
