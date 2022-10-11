package io.codelex.polymorphism.practice.exercise1;

public class Nisan implements Car, NitrousOxide {

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 17;
    }

    public void slowDown() {
        currentSpeed -= 17;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public String toString() {
        return "Nisan{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
