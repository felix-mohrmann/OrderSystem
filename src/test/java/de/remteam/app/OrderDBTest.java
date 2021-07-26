package de.remteam.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBTest {

    @Test
    public void testAfterDBInit() {
        // Given
        OrderDB orderDB = new OrderDB();

        // When
        List<Order> actual = orderDB.listOfAllOrders();

        //Then
        List<Order> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetOrderById(){
        // Given
        OrderDB orderDB = new OrderDB();
        Map<Product, Integer> products = Map.of(
                new Software("facebook", 1), 1,
                new Software("amazon", 2), 1,
                new Software("netflix", 3), 1,
                new Software("google", 4), 1
        );
        orderDB.addOrder(products);

        // When
        Optional<Order> order = orderDB.getOrderByID(1);
        Order actual;
        if(order.isPresent()){
            actual = order.get();
            // Then
            Order expected = new Order(1, Map.of(
                    new Software("facebook", 1), 1,
                    new Software("amazon", 2), 1,
                    new Software("netflix", 3), 1,
                    new Software("google", 4), 1
            ));
            assertEquals(expected, actual);
        } else {
            fail("no Product found by ID returned optional was empty");
        }
    }

    @Test
    public void testInvalidOrderId(){
        // Given
        OrderDB orderDB = new OrderDB();
        Map<Product, Integer> products = Map.of(
                new Software("facebook", 1), 1,
                new Software("amazon", 2), 1,
                new Software("netflix", 3), 1,
                new Software("google", 4), 1
        );
        orderDB.addOrder(products);

        // When
        Optional<Order> order = orderDB.getOrderByID(2);

        // Then
        assertFalse(order.isPresent());
    }
}