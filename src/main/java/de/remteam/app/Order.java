package de.remteam.app;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final int id;
    private List<Product> orderedProducts = new ArrayList<>();

    public Order(int id, List<Product> orderedProducts) {
        this.id = id;
        this.orderedProducts = orderedProducts;
    }

    public int getId() {
        return id;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }
}
