package de.remteam.app;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {


    @Test
    public void testWithAfterDBInit() {
        // Given
        ProductDB productDB = new ProductDB();

        // When
        List<Product> actual = productDB.listOfAllProducts();

        //Then
        List<Product> expected = List.of(
                new Product("facebook", 1),
                new Product("amazon", 2),
                new Product("netflix", 3),
                new Product("google", 4)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void testGetProductById(){
        // Given
        ProductDB productDB = new ProductDB();

        // When
        Optional<Product> product = productDB.getProductByID(2);
        Product actual;
        if(product.isPresent()){
            actual = product.get();
            // Then
            Product expected = new Product("amazon", 2);
            assertEquals(expected, actual);
        } else {
            fail("no Product found by ID returned optional was empty");
        }
    }

    @Test
    public void testGetProductByInvalidId(){
        // Given
        ProductDB productDB = new ProductDB();

        // When
        Optional<Product> product = productDB.getProductByID(5);
        boolean actual = product.isPresent();
        assertFalse(actual);
    }
}