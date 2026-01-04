package org.payment;

public class PayPal extends Payment { //inheritance
    private String email; //encapsulation

    PayPal(double amount, String email) {
        super(amount);
        this.email = email;
    }

    public void pay() {
        logStart();
        System.out.println("payment is done with PayPal.");
        logEnd();
    }

    public void validatePayment() {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }

    }
}
