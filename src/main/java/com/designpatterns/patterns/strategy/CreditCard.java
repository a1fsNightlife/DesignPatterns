package com.designpatterns.patterns.strategy;

public class CreditCard {

    private int balance;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.balance = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
