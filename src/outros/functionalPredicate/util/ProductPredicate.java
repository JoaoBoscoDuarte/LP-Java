package outros.functionalPredicate.util;

import java.util.function.Predicate;
import outros.functionalPredicate.entities.Product;

public class ProductPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 500.0;
    }
}
