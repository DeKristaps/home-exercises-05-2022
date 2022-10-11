package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 12;
    }

    public void slowDown() {
        currentSpeed -= 12;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
