package io.codelex.arrays.examples;

public class ArrayExample {
    public static void main(String[] args) {
        //must have an initial size defined
        int myArray[] = new int[7];

        myArray[0] = 7;
        myArray[1] = 3;
        myArray[2] = 9;
        myArray[3] = 8;
        myArray[4] = 4;
        myArray[5] = 8;
        myArray[6] = 6;

        System.out.println(myArray[0]); //7
        System.out.println(myArray[3]); //8
    }
}
