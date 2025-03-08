package banco.application;

import banco.entities.Conta;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta novaConta = new Conta();
        novaConta.nome = sc.nextLine();
        novaConta.deposito(sc.nextDouble());
        novaConta.setNumeroConta(sc.nextInt());

        System.out.println(novaConta);

    }
}
