package de.remteam.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
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
        List<Product> products = List.of(
                new Product("facebook", 1),
                new Product("amazon", 2),
                new Product("netflix", 3),
                new Product("google", 4)
        );
        orderDB.addOrder(products);

        // When
        Optional<Order> order = orderDB.getOrderByID(1);
        Order actual;
        if(order.isPresent()){
            actual = order.get();
            // Then
            Order expected = new Order(1, List.of(
                    new Product("facebook", 1),
                    new Product("amazon", 2),
                    new Product("netflix", 3),
                    new Product("google", 4)
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
        List<Product> products = List.of(
                new Product("facebook", 1),
                new Product("amazon", 2),
                new Product("netflix", 3),
                new Product("google", 4)
        );
        orderDB.addOrder(products);

        // When
        Optional<Order> order = orderDB.getOrderByID(2);

        // Then
        assertFalse(order.isPresent());
    }
}