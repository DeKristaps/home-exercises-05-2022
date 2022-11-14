package io.codelex.arrays.practice;

public class Exercise5 {

    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int indexOfElement36 = -1;
        int indexOfElement29 = -1;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 36) {
                indexOfElement36 = i;
            }
            if (myArray[i] == 29) {
                indexOfElement29 = i;
            }
        }

        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);

    }
}
