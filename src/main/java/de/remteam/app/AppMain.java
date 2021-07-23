package de.remteam.app;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        OrderDB ourOrderDB = new OrderDB();
        ProductDB ourProductDB = new ProductDB();
        List<Product> einkaufswaagen = new ArrayList<>();
        List<Product> verkaufsregal = ourProductDB.listOfAllProducts();
        einkaufswaagen.add(verkaufsregal.get(0));
        einkaufswaagen.add(verkaufsregal.get(3));
        OrderService.addOrder(ourOrderDB,einkaufswaagen);
        System.out.println(ourOrderDB);
        System.out.println(ourProductDB);
    }

}
