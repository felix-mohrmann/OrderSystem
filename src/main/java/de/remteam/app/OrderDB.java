package de.remteam.app;

import java.util.*;

public class OrderDB {

    Map<Integer, Order> orderDB = new HashMap<>();

    public List<Order> listOfAllOrders(){
        return new ArrayList<>(orderDB.values());
    }

    public Optional<Order> getOrderByID(int whichID){
        if (orderDB.containsKey(whichID)) {
            return Optional.of(orderDB.get(whichID));
        }
        return Optional.empty();
    }

    public void addOrder(List<Product> products){
        int id = orderDB.size() +1;

        Order order = new Order(id, products);
        orderDB.put(id, order);
    }

}
