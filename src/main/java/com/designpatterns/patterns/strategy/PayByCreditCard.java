package com.designpatterns.patterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setBalance(card.getBalance() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy: '");
            String expirationDate = READER.readLine();
            System.out.println("Enter the CVV code: ");
            String cvvCode = READER.readLine();
            card = new CreditCard(number, expirationDate, cvvCode);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
