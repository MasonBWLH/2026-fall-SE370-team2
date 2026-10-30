package dao;

import model.User;

// Defines the methods needed to access user data
public interface UserDAOInterface {

    // Finds a user by their email address
    User findByEmail(String email);
}