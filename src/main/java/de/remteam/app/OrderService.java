package de.remteam.app;

import java.util.List;
import java.util.Map;

public class OrderService {

    private OrderDB ourOrderDB = new OrderDB();

    public void addOrder(Map<Product, Integer> einkaufswagen) {
        ourOrderDB.addOrder(einkaufswagen);
    }

    public List<Order> listOrders() {
        return ourOrderDB.listOfAllOrders();
    }

}
