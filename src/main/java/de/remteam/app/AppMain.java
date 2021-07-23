package de.remteam.app;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        ProductDB ourProductDB = new ProductDB();
        List<Product> einkaufswaagen = new ArrayList<>();
        List<Product> verkaufsregal = ourProductDB.listOfAllProducts();

        try{
            einkaufswaagen.add(verkaufsregal.get(0));
            einkaufswaagen.add(verkaufsregal.get(3));
        } catch (RuntimeException e){
            System.out.println("Diese Produkte sind nicht verfügbar");
        }

        try {
            einkaufswaagen.add(verkaufsregal.get(9));

        } catch (RuntimeException e){
            System.out.println("Diese Produkte sind nicht verfügbar");
        }

        orderService.addOrder(einkaufswaagen);
        System.out.println(ourProductDB);
    }

}
