package areaTriângulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Instanciando um objeto da classe Triangle
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Medidas do triângulo x: ");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();

        System.out.println("Medidas do triângulo y: ");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        double areaX = x.area();
        double areay = y.area();
    }
}
