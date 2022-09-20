package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double literFilled;
        int currentOdometer;

        Car car = UserInput(scan);

        System.out.println("Time to refuel. Whats the current odometer and how much you want to fill?");
        currentOdometer = scan.nextInt();


        literFilled = scan.nextDouble();

        car.fillUp(currentOdometer, literFilled);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());
        if (car.isGasHog()) {
            System.out.println("You should consider buying a house instead");
        }
        if (car.isEconomyCar()) {
            System.out.println("You must have a lot of spare change");
        }

        currentOdometer = scan.nextInt();
        literFilled = scan.nextDouble();

        car.fillUp(currentOdometer, literFilled);


        System.out.println("Kilometers per liter are " + car.calculateConsumption());


        Car car2 = UserInput(scan);

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());

    }

    private static Car UserInput(Scanner scan) {
        double startKilometers;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        return new Car(startKilometers);
    }
}
