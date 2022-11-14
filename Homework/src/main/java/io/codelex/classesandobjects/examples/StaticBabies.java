package io.codelex.classesandobjects.examples;

public class StaticBabies {
    public static void main(String[] args) {
        System.out.println(StaticBaby.numBabiesMade);
        // 0

        new StaticBaby();
        new StaticBaby();

        System.out.println(StaticBaby.numBabiesMade);
        // 2
    }
}
