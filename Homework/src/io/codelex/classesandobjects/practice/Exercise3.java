package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.FuelGauge.*;
import static io.codelex.classesandobjects.practice.Odometer.*;

public class Exercise3 {
        public static void main(String[] args) {
            FuelGauge.refuel();


            while (getCurrentFuelLevel() != 0){
                System.out.println(getCurrentFuelLevel());
                System.out.println(getCurrentOdometer());
                Odometer.increaseOdometer();

            }
        }


    }



