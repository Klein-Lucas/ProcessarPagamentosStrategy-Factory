package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPayment(String type) {
        if (type.equalsIgnoreCase("1") || type.equalsIgnoreCase("boleto")) {
            return new BoletoPayment();
        } else if (type.equalsIgnoreCase("2") || type.equalsIgnoreCase("cartao de credito")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("3") || type.equalsIgnoreCase("pix")) {
            return new PixPayment();
        }
        return null;
    }
}