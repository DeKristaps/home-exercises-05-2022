package io.codelex.enums.practice.exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int timesPlayed = 0;
        int playerWon = 0;
        int pcWon = 0;

        while (true) {

            System.out.println("Your turn (Enter s for scissor, p for paper, r for rock, q to quit): ");
            RockPaperScissors playerChoice = RockPaperScissors.valueOf(userInput.next().toUpperCase());
            if (playerChoice == RockPaperScissors.Q) {
                break;
            }
            RockPaperScissors pcChoice = RockPaperScissors.getRandomRps();

            System.out.println("The pc chose: " + pcChoice.getValue());

            if ((playerChoice == RockPaperScissors.R && pcChoice == RockPaperScissors.S) ||
                    (playerChoice == RockPaperScissors.S && pcChoice == RockPaperScissors.P) ||
                    (playerChoice == RockPaperScissors.P && pcChoice == RockPaperScissors.R)) {
                playerWon++;
                System.out.println("You win this one! ");
            } else if (playerChoice == pcChoice) {
                System.out.println("It's a tie");
            } else {
                pcWon++;
                System.out.println("The PC won this one! ");
            }
            timesPlayed++;
        }
        BigDecimal playerWin = getBigDecimal(timesPlayed, pcWon);
        BigDecimal pcWin = getBigDecimal(timesPlayed, pcWon);
        BigDecimal draws = BigDecimal.valueOf(100).subtract(pcWin).subtract(playerWin);

        System.out.println("You played a total of " + timesPlayed + " times");
        System.out.println("You won " + playerWin + "% of the games");
        System.out.println("Pc won " + pcWin + "%");
        System.out.println(draws + "% of the games wer a draw");
    }

    public static BigDecimal getBigDecimal(int timesPlayed, int timeWon) {
        return BigDecimal.valueOf(timeWon).divide(BigDecimal.valueOf(timesPlayed), 2, RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100));
    }
}
