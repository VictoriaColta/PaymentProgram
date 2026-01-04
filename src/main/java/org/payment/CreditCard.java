package org.payment;

public class CreditCard extends Payment { //inheritance
    private String cardNumber;//encapsulation

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void pay() {
        logStart();
        System.out.println("Payment is made with Credit card.");
        logEnd();
    }

    public void validatePayment() {
        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("Invalid card number.");
        }
    }

}
