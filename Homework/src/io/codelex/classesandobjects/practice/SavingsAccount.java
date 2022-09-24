package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    private final BigDecimal ANNUAL_INTEREST_RATE;
    static BigDecimal balance;
    static BigDecimal totalDeposit = BigDecimal.valueOf(0);
    static BigDecimal totalWithdrawn = BigDecimal.valueOf(0);
    static BigDecimal interestEarned = BigDecimal.valueOf(0);

    public SavingsAccount(BigDecimal interest, BigDecimal startBalance) {
        ANNUAL_INTEREST_RATE = interest;
        balance = startBalance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getTotalDeposit() {
        return totalDeposit;
    }

    public BigDecimal getTotalWithdrawn() {
        return totalWithdrawn;
    }

    public BigDecimal getInterestEarned() {
        return interestEarned;
    }

    public void subtract(BigDecimal subAmount) {
        totalWithdrawn = totalWithdrawn.add(subAmount);
        balance = balance.subtract(subAmount);
    }

    public void deposit(BigDecimal depAmount) {
        totalDeposit = totalDeposit.add(depAmount);
        balance = balance.add(depAmount);
    }

    public void calculateMonthlyInterest() {
        BigDecimal earned;
        BigDecimal monthlyInterest = ANNUAL_INTEREST_RATE.divide(BigDecimal.valueOf(12), 2, RoundingMode.HALF_DOWN);
        earned = balance.multiply(monthlyInterest);
        interestEarned = interestEarned.add(earned);
        balance = balance.add(earned);

    }
}
