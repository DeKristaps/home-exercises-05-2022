package io.codelex.classesandobjects.practice;

public class FuelGauge {

    int currentFuelLevel;

    public FuelGauge(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getCurrentFuelLevel() {
        return this.currentFuelLevel;
    }

    void refuel() {
        if (this.currentFuelLevel <= 70) {
            this.currentFuelLevel++;
        }
    }

    void consume() {
        if (this.currentFuelLevel > 0) {
            this.currentFuelLevel--;
        }
    }


}
