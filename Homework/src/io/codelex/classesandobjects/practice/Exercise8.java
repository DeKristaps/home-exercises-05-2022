package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        Scanner userInput = new Scanner(System.in);

        System.out.println("How much money is in the account?:");
        BigDecimal balance = userInput.nextBigDecimal();

        System.out.println("What is your banks annual interest rate?:");
        BigDecimal interest = userInput.nextBigDecimal();

        System.out.println("How long has the account been opened?");
        int time = userInput.nextInt();

        SavingsAccount acc = new SavingsAccount(interest, balance);


        for (int i = 1; i <= time; i++) {
            System.out.println("Enter amount deposited for month " + i + ":");
            BigDecimal deposit = userInput.nextBigDecimal();
            System.out.println("Enter amount withdrawn for month " + i + ":");
            BigDecimal withdraw = userInput.nextBigDecimal();

            SavingsAccount.deposit(deposit);
            SavingsAccount.subtract(withdraw);
            SavingsAccount.calculateMonthlyInterest();

        }

        System.out.printf("Total deposited: $%s \n", df.format(SavingsAccount.getTotalDeposit()));
        System.out.printf("Total withdrawn: $%s \n", df.format(SavingsAccount.getTotalWithdrawn()));
        System.out.printf("Interest earned: $%s \n", df.format(SavingsAccount.getInterestEarned()));
        System.out.printf("Ending balance: $%s \n", df.format(SavingsAccount.getBalance()));

    }
}
