package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 17;
    }


    public void slowDown() {
        currentSpeed -= 15;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }
}
