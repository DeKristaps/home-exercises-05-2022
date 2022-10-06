package io.codelex.enums.practice.exercise2;

import java.util.Random;

public enum RockPaperScissors {
    R("ROCK"),
    P("PAPER"),
    S("SCISSORS"),
    Q("QUIT");

    private final String value;

    RockPaperScissors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static RockPaperScissors getRandomRps() {
        Random randomMove = new Random();
        int randomOrdinal = randomMove.nextInt(0, 3);
        for (RockPaperScissors value : RockPaperScissors.values()) {
            if (value.ordinal() == randomOrdinal) {
                return value;
            }
        }
        return R;
    }

}
