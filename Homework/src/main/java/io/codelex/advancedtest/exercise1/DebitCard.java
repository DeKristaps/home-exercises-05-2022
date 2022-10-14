package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String owner, int ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void addMoney(double money) {
        super.addMoney(money);
        if ((super.getBalance().compareTo(BigDecimal.valueOf(10000)) > 0)) {
            System.out.println("Warning: Too much money");
        }
    }
}
