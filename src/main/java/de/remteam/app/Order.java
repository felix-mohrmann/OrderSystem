package de.remteam.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Objects.equals(orderedProducts, order.orderedProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderedProducts);
    }
}
