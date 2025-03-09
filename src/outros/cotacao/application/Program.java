package outros.cotacao.application;

import outros.cotacao.entities.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

    }
}
