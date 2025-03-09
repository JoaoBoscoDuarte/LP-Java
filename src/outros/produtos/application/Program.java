package outros.produtos.application;

import outros.produtos.entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Nome: ");
        //modificando os atributos do objeto
        String nome = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        System.out.println("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        //Instanciamento do objeto
        Product produto = new Product(nome, preco, quantidade);

        sc.close();
    }
}
