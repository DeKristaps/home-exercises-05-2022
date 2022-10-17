package io.codelex.classesandobjects.practice;

public class Odometer {
    private int currentOdometer = 1000;

    private int distanceTraveled = 0;

    public Odometer(int currentOdometer) {
        this.currentOdometer = currentOdometer;
    }

    public int getCurrentOdometer() {
        return currentOdometer;
    }

    public void increaseOdometer(FuelGauge fuelGauge) {
        if (this.currentOdometer < 999999) {
            this.currentOdometer++;
        } else {
            this.currentOdometer = 0;
        }
        this.distanceTraveled++;

        if (this.distanceTraveled == 10) {
            fuelGauge.consume();
            this.distanceTraveled = 0;
        }
    }

}
