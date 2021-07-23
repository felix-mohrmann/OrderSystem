package de.remteam.app;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBTest {


    @Test
    public void testAfterDBInit() {
        // Given
        ProductDB productDB = new ProductDB();

        // When
        List<Product> actual = productDB.listOfAllProducts();

        //Then
        List<Product> expected = List.of(
                new Product("Facebook", 1),
                new Product("Amazon", 2),
                new Product("Netflix", 3),
                new Product("Google", 4)
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
            Product expected = new Product("Amazon", 2);
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

        //Then
        assertFalse(product.isPresent());
    }
}