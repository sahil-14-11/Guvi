package com.example;

import com.example.dao.UserDAO;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Create users
        userDAO.createUser("Alice", "alice@example.com", "password123");
        userDAO.createUser("Bob", "bob@example.com", "password456");

        // Retrieve all users
        System.out.println("All Users:");
        userDAO.getAllUsers().forEach(System.out::println);

        // Update a user
        userDAO.updateUser(1, "Alice Smith", "alice.smith@example.com");

        // Delete a user
        userDAO.deleteUser(2);

        // Retrieve all users again
        System.out.println("Updated Users:");
        userDAO.getAllUsers().forEach(System.out::println);
    }
}
