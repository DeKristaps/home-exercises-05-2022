package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        if(balance < 0 ){
            balance = balance * -1;
        }
        return String.format("%s, $%.2f", name, balance);
    }

    public static void main(String[] args) {
        BankAccount benson = new BankAccount("Benson", 13.50);
        System.out.println(benson.toString());
    }
}
