package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    Integer currentSpeed = 0;

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    ;


}
