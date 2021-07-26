package de.remteam.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMain {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        ProductDB ourProductDB = new ProductDB();
        Map<Product, Integer> einkaufswaagen = new HashMap<>();
        List<Product> verkaufsregal = ourProductDB.listOfAllProducts();

        try{
            einkaufswaagen.put(verkaufsregal.get(0), 2);
            einkaufswaagen.put(verkaufsregal.get(3), 1);
        } catch (RuntimeException e){
            System.out.println("Diese Produkte sind nicht verfügbar");
        }

        try {
            einkaufswaagen.put(verkaufsregal.get(9), 1);

        } catch (RuntimeException e){
            System.out.println("Diese Produkte sind nicht verfügbar");
        }

        orderService.addOrder(einkaufswaagen);
        System.out.println(orderService.listOrders());
        System.out.println(ourProductDB);
    }
}
