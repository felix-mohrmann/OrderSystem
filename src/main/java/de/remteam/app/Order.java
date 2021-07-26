package de.remteam.app;

import java.util.*;

public class Order {

    private final int id;
    private Map<Product, Integer> orderedProducts = new HashMap<>();

    public Order(int id, Map<Product, Integer> orderedProducts) {
        this.id = id;
        this.orderedProducts = orderedProducts;
    }

    public int getId() {
        return id;
    }

    public List<Product> getOrderedProducts() {
        return (List) orderedProducts;
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

    @Override
    public String toString() {
        return "ID= "+id+" Bestellte Produkte= "+orderedProducts;
    }
}
