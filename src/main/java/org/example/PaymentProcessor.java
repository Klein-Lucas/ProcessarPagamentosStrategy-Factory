package org.example;

public class PaymentProcessor{

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double forma) {
        paymentStrategy.processPayment(forma);
    }
}