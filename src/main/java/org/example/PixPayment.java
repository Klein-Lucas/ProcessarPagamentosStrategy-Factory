package org.example;
import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int code = random.nextInt(1000000); // gera um código aleatório
        System.out.println(String.format("Pagamento de R$%.2f realizado via PIX.", amount));
        System.out.println("Código PIX: " + code);
    }
}