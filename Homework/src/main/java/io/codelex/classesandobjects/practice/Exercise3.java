package io.codelex.classesandobjects.practice;

public class Exercise3 {
    private static Odometer odometer = new Odometer(1000);
    private static FuelGauge fuelGauge = new FuelGauge(68);

    public static void main(String[] args) {
        fuelGauge.refuel();


        while (fuelGauge.getCurrentFuelLevel() != 0) {
            System.out.println(fuelGauge.getCurrentFuelLevel());
            System.out.println(odometer.getCurrentOdometer());
            odometer.increaseOdometer(fuelGauge);

        }
    }


}



