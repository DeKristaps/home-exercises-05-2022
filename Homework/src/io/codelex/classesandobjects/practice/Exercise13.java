package io.codelex.classesandobjects.practice;

public class Exercise13 {
    public static void main(String[] args) {
        Account mattsAccount = new Account("Matt", 1000);
        Account myAccount = new Account("Kristaps", 0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(myAccount.balance());
        System.out.println(mattsAccount.balance());


        Account A = new Account("a", 100.0);
        Account B = new Account("a", 0.0);
        Account C = new Account("a", 0.0);

        transfer(A, B, 50.0);
        transfer(B, C, 25.0);

        System.out.println(A.balance());
        System.out.println(B.balance());
        System.out.println(C.balance());
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
