package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String owner, int ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void takeMoney(double money) {
        int test = getBalance().compareTo(BigDecimal.valueOf(money));
        if (test < 0) {
            throw new NotEnoughFundsException("Its not possible to take out the amount you are requesting");
        } else {
            super.takeMoney(money);
        }
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 1) {
            System.out.println("Warning: Low funds");
        }

    }

}

