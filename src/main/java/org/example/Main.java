package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String esc;
        double amount;
        PaymentProcessor pagamento = new PaymentProcessor();


        do {
            System.out.println("/n=== SELECIONA UMA FORMA DE PAGAMENTO ===/n");
            System.out.println("1. Pagamento por BOLETO");
            System.out.println("2. Pagamento por CARTAO DE CREDITO");
            System.out.println("3. Pagamento por PIX");
            System.out.println("0. Para sair");
            System.out.println("Opção: ");
            Scanner scanner = new Scanner(System.in);
            esc = scanner.nextLine();

            System.out.print("Digite o valor da transação: ");
            amount = scanner.nextDouble();


            PaymentStrategy forma = PaymentFactory.createPayment(esc);

            pagamento.setPaymentStrategy(forma);
            pagamento.executePayment(amount);

        } while (esc != "0");


    }
}