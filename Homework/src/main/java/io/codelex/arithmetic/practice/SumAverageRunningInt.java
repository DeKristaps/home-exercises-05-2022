package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        float average;
        int lowerBound = 1;
        int upperBound = 100;


        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = (float) sum / (upperBound - lowerBound);

        System.out.printf("the sum of %d to %d is %d \n", lowerBound, upperBound, sum);
        System.out.printf("the average is %.1f\n", average);
    }
}
