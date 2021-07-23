package de.remteam.app;

import java.util.*;

public class ProductDB {

    private final Map<Integer, Product> productsDB = new HashMap<>();

    public ProductDB() {
        Product facebook = new Product("Facebook", 1);
        Product amazon = new Product("Amazon", 2);
        Product netflix = new Product("Netflix", 3);
        Product google = new Product("Google", 4);
        add(facebook);
        add(amazon);
        add(netflix);
        add(google);
    }

    private void add(Product whichProduct){
        productsDB.put(whichProduct.getId(),whichProduct);
    }

    public List<Product> listOfAllProducts (){
        return new ArrayList<>(productsDB.values());
    }

    public Optional<Product> getProductByID(int whichID){
        if (productsDB.containsKey(whichID)) {
            return Optional.of(productsDB.get(whichID));
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Unser Sortiment an Top Software: "+productsDB;
    }
}

