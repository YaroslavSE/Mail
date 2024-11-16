package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testUserCreation() {
        User user = new User(1, "Alice", "123 Main St, City");

        assertEquals(1, user.getUserId(), "User ID should be 1");
        assertEquals("Alice", user.getName(), "User name should be Alice");
        assertEquals("123 Main St, City", user.getAddress(), "User address should be '123 Main St, City'");
    }

    @Test
    public void testSettersAndGetters() {
        User user = new User(1, "Alice", "123 Main St, City");

        user.setName("Bob");
        user.setAddress("456 Elm St, City");

        assertEquals("Bob", user.getName(), "User name should be updated to Bob");
        assertEquals("456 Elm St, City", user.getAddress(), "User address should be updated to '456 Elm St, City'");
    }
}
