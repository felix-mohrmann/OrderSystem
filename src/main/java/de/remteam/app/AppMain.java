package de.remteam.app;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        OrderDB ourOrderDB = new OrderDB();
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

        OrderService.addOrder(ourOrderDB,einkaufswaagen);
        System.out.println(ourOrderDB);
        System.out.println(ourProductDB);
    }

}
