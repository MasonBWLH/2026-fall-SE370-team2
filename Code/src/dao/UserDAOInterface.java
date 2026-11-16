package dao;

import model.User;

// Defines methods used to access user account data
public interface UserDAOInterface {

    // Finds a user by email
    User findByEmail(String email);

    // Adds a new user account
    boolean addUser(User user);
}