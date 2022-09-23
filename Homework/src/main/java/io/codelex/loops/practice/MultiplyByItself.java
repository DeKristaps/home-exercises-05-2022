package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input i : ");
        int i = in.nextInt();
        System.out.print("Input number of terms : ");
        int n = in.nextInt();
        int sum = 1;


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j = 0; j <= n; j++) {
            sum *= i;
            System.out.println(sum);
        }


    }

}
