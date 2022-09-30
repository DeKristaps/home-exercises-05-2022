package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        int n = 7;
        int lines = (n - 1) * 2;

        StringBuilder outputLine = new StringBuilder();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < lines - i * 2; j++) {
                outputLine.append("//");
            }
            for (int k = 0; k < 8 * i; k++) {
                outputLine.append("*");
            }
            for (int j = 0; j < lines - i * 2; j++) {
                outputLine.append("\\\\");
            }
            outputLine.append("\n");

        }
        System.out.println(outputLine);
    }
}



