package de.remteam.app;

import java.util.List;

public class OrderService {

    private OrderDB ourOrderDB = new OrderDB();

    public void addOrder(List<Product> einkaufswagen) {
        addOrder(einkaufswagen);
    }

    public List<Order> listOrders() {
        return ourOrderDB.listOfAllOrders();
    }

}
