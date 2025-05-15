package outros.functionalPredicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import outros.functionalPredicate.entities.Product;
import outros.functionalPredicate.util.ProductPredicate;

public class App {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
        list.add(new Product("Mause", 243.99));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

        // Implementação da interface =============================================================
        // Remove um objeto p (da lista do tipo product) talque o preço de p é maior que 500 (como definido na interface)
        list.removeIf(new ProductPredicate());

        // Lista a nova lista com os objetos removidos  
        for (Product p : list) {
            System.out.println(p.toString());
        }

        System.out.println();

        // Reference method com método estáticoc ==================================================
        // remove o objeto que o preço é menor igual a 50
        list.removeIf(Product::staticProductPredicate);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        System.out.println();

        // Reference method com método NÂO estático ===========================================
        // remove objetos com o preço menor que 100
        list.removeIf(Product::noStaticProductPredicate);
        for (Product p : list) {
            System.out.println(p.toString());
        }

        System.out.println();

        // Expressão lambda declarada =========================================================
        Predicate<Product> pred = p -> p.getPrice() > 100.0 || p.getPrice() <= 300;
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p.toString());
        }

        System.out.println();

        // Expressão lambda inline =========================================================
        list.removeIf(p -> p.getPrice() > 100.0 && p.getPrice() < 500.0);
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}