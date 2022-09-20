package io.codelex.classesandobjects.practice;

public class FuelGauge {

    static int currentFuelLevel = 69;

    public static int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public static void refuel() {
        if (currentFuelLevel <= 70) {
            currentFuelLevel++;
        }
    }

    public static void consume() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
        }
    }


}
