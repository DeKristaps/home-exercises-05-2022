package io.codelex.enums.practice.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        for (CardinalPoints direction : CardinalPoints.values()) {
            System.out.println(direction + ":" + direction.getCardinalDirection() + ":" + direction.ordinal());
        }
    }
}
