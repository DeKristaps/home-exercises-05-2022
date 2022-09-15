package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            StringBuilder outputString = new StringBuilder(" ");
            if (i % 3 == 0) {
                outputString.append("Coza");
            }
            if (i % 5 == 0) {
                outputString.append("Loza");
            }
            if (i % 7 == 0) {
                outputString.append("Woza");
            }
            if (outputString.toString().equals(" ")) {
                outputString.append(i);
            }
            if (i % 11 == 0) {
                outputString.append("\n");
            }
            System.out.print(outputString);
        }

    }
}

