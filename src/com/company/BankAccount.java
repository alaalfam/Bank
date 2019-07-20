package com.company;

import java.util.Random;

public class BankAccount {
    private int balance=0;
    private String accountNumber;

    public BankAccount(int mony) {
        Random random = new Random();
        if (balance+mony >= 10) {
            this.balance = balance+mony;
            this.accountNumber = Math.abs(random.nextInt(5555555)) + "";
        } else {
            System.out.println("Your balance must be at least 10$.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
