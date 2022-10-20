package com.mshalaby;

public class Main {
    public static void main(String[] args) {
        Account msAccount = new Account("ms");
        msAccount.deposit(1000);
        msAccount.withdraw(100);
        msAccount.withdraw(-200);
        msAccount.withdraw(-20);
        msAccount.calculateBalance();
        //msAccount.balance = 500;
        System.out.println("Balance on account is " + msAccount.getBalance());
        //msAccount.transactions.add(4500);
        msAccount.calculateBalance();
    }
}