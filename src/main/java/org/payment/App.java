package org.payment;

import java.util.Scanner;

/**
 * 🧩 OOP PRACTICE EXERCISE
 * 📝 Problem Statement
 * You are building a simple payment system.
 * Requirements
 * The system must support different payment methods:
 * Credit Card
 * PayPal
 * Every payment method must:
 * Process a payment
 * Validate payment details
 * Some behavior is common to all payments:
 * Store the amount
 * Log when payment starts and finishes
 * Each payment method has its own validation logic:
 * Credit Card: card number must be 16 digits
 * PayPal: email must contain @
 * The main program should be able to:
 * Process payments without knowing the exact payment type
 * 🎯 Your Task
 * Design classes using OOP principles:
 * Use encapsulation to protect data
 * Use abstraction to hide implementation details
 * Use inheritance where appropriate
 * Use polymorphism to process payments generically
 */

// POLYMORPHISM IN ACTION
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount:");
        double amount;
        amount = scanner.nextDouble();
        System.out.println("Credit card number:");
        String creditCard = scanner.next();

        PaymentMethod paymentMethod1 = new CreditCard(amount, creditCard);

        processPaymentMethod(paymentMethod1);

        System.out.println("Payment method PayPal, the amount is: ");
        amount = scanner.nextDouble();
        PaymentMethod paymentMethod2 = new PayPal(amount, "email@gmail.com");
        processPaymentMethod(paymentMethod2);

    }

    static void processPaymentMethod(PaymentMethod payment) {
        payment.pay();
        payment.validatePayment();
    }
}
