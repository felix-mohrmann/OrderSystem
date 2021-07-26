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
                new Software("Facebook", 1),
                new Software("Amazon", 2),
                new Software("Netflix", 3),
                new Software("Google", 4)
        );
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testGetProductById() {
        // Given
        ProductDB productDB = new ProductDB();

        // When
        Optional<Product> product = productDB.getProductByID(2);
        if (product.isPresent()) {
            Product actual = product.get();
            // Then
            Product expected = new Software("Amazon", 2);
            assertEquals(expected, actual);
        } else {
            fail("no Product found by ID returned optional was empty");
        }
    }

    @Test
    public void testGetProductByInvalidId() {
        // Given
        ProductDB productDB = new ProductDB();

        // When
        Optional<Product> product = productDB.getProductByID(5);

        //Then
        assertFalse(product.isPresent());
    }
}