package io.codelex.oop.runners;

import java.time.LocalTime;

public class Exercise4 {
    public static void main(String[] args) {
        LocalTime runTime = LocalTime.of(1,20,30);

        System.out.println(Runner.getFitnessLevel(runTime));
    }
}
