package outros.functionalPredicate.entities;

import java.util.List;

public class Product {
    
    private double price;
    public String name;

    public Product(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() <= 50;
    }

    public boolean noStaticProductPredicate() {
        return price <= 100;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + ", name=" + name + "]";
    }
}