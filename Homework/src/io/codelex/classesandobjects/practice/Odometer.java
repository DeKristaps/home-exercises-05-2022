package io.codelex.classesandobjects.practice;

public class Odometer {
    static int currentOdometer = 1000;

    static int distanceTraveled = 0;

    public static int getCurrentOdometer() {
        return currentOdometer;
    }

    public static void increaseOdometer() {
        if (currentOdometer < 999999) {
                currentOdometer++;
            } else {
                currentOdometer = 0;
            }
        distanceTraveled++;

        if (distanceTraveled == 10) {
            FuelGauge.consume();
            distanceTraveled=0;
        }
    }

}
