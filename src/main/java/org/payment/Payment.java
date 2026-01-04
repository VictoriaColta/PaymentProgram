package org.payment;


//abstraction applied
abstract class Payment implements PaymentMethod {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    protected void logStart() {
        System.out.println("Payment started with $ " + this.amount);
    }

    protected void logEnd() {
        System.out.println("Payment ended.");
    }

    public abstract void pay();

    public abstract void validatePayment();


}
