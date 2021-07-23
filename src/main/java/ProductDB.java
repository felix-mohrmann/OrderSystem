import java.util.HashMap;
import java.util.Map;

public class ProductDB {

    private final Map<Integer, Product> products;

    public ProductDB() {
        Product facebook = new Product("facebook", 1);
        Product amazon = new Product("amazon", 2);
        Product netflix = new Product("netflix", 3);
        Product google = new Product("google", 4);
        products = new HashMap<>(Map.of(
                facebook.getId(), facebook,
                amazon.getId(), amazon,
                netflix.getId(), netflix,
                google.getId(), google)
        );
    }
}
