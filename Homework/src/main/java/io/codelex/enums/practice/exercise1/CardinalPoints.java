package io.codelex.enums.practice.exercise1;

public enum CardinalPoints {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String getCardinalDirection() {
        return direction;
    }
}
