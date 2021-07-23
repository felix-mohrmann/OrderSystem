package de.remteam.app;

import java.util.List;

public class OrderService {

    public static void addOrder(OrderDB currentOrderDB, List<Product> einkaufswagen) {
        currentOrderDB.addOrder(einkaufswagen);
    }

    public static List<Order> listOrders(OrderDB currentOrderDB) {
        return currentOrderDB.listOfAllOrders();
    }

}
