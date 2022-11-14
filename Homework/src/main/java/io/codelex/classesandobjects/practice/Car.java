package io.codelex.classesandobjects.practice;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return (liters * 100) / (endKilometers - startKilometers);
    }

    public boolean isGasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean isEconomyCar() {
        return calculateConsumption() < 5.0;
    }


}
