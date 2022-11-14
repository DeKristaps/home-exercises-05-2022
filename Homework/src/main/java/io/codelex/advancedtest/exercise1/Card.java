package io.codelex.advancedtest.exercise1;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

abstract class Card {

    private String cardNumber;
    private String owner;
    private int ccv;
    private BigDecimal balance;

    public Card(String cardNumber, String owner, int ccv, double balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = new BigDecimal(balance);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addMoney(double money) {
        this.balance = this.balance.add(BigDecimal.valueOf(money));
    }

    public void takeMoney(double money) {
        int test = this.balance.compareTo(BigDecimal.valueOf(money));
        if (test < 0) {
            throw new NotEnoughFundsException("Its not possible to take out the amount you are requesting");
        } else {
            this.balance = this.balance.subtract(valueOf(money));
        }
    }


}
