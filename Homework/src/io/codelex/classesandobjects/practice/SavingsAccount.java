package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    static BigDecimal ANNUAL_INTEREST_RATE;
    static BigDecimal balance;
    static BigDecimal totalDeposit = BigDecimal.valueOf(0);
    static BigDecimal totalWithdrawn = BigDecimal.valueOf(0);
    static BigDecimal interestEarned = BigDecimal.valueOf(0);


    public static BigDecimal getBalance() {
        return balance;
    }

    public static BigDecimal getTotalDeposit() {
        return totalDeposit;
    }

    public static BigDecimal getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public static BigDecimal getInterestEarned() {
        return interestEarned;
    }

    public SavingsAccount(BigDecimal interest, BigDecimal startBalance) {
        ANNUAL_INTEREST_RATE = interest;
        balance = startBalance;
    }

    public static void subtract(BigDecimal subAmount) {
        totalWithdrawn = totalWithdrawn.add(subAmount);
        balance = balance.subtract(subAmount);
    }

    public static void deposit(BigDecimal depAmount) {
        totalDeposit = totalDeposit.add(depAmount);
        balance = balance.add(depAmount);
    }

    public static void calculateMonthlyInterest() {
        BigDecimal earned;
        BigDecimal monthlyInterest = ANNUAL_INTEREST_RATE.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_DOWN);
        earned = balance.multiply(monthlyInterest);
        interestEarned = interestEarned.add(earned);
        balance = balance.add(earned);

    }
}
