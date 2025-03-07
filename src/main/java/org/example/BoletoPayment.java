package org.example;
import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int boletoCode = random.nextInt(100000000);
        System.out.println(String.format("Pagamento de R$%.2f realizado via Boleto.", amount));
        System.out.printf("Código do Boleto: BOLETO - " + boletoCode);
    }
}